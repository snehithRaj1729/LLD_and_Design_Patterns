package org.example;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class CartScript {

    private static final String ENV = "dev";
    private static final String BASE_DIR = "C:/Users/snraj/OneDrive - medline.com/Desktop/LLD_and_Design_Patterns/Splitwise_LLD/src/main/java/org/exampledata/data";
    private static final String SERVICE_CONFIG_FILE = "./config/ServiceConfig_" + ENV + ".txt";
    private static final String USER_CREDS_FILE = "./data/ServiceData_" + ENV + ".txt";
    private static final String CART_IDS_OUTPUT_FILE = BASE_DIR + "CartIdsData_" + ENV + "_new.txt";

    private static String accessToken = "";

    public static void main(String[] args) {
        try {
            retrieveAccessToken();
            generateCartIds();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            writer.newLine();
        }
    }

    private static void retrieveAccessToken() throws Exception {
        String[] userCreds = readFile(USER_CREDS_FILE).split(",");
        String userId = userCreds[0];
        String userPwd = userCreds[1];

        System.out.println("Retrieving access token for user: " + userId);

        URL url = new URL("https://your-token-service-url" +
                "?password=" + userPwd +
                "&validator_id=ATGPasswordValidator&grant_type=password&scope=openid&username=" + userId);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Basic UExNT1JwajBWWkNsRmJkcGFHSzBCSjdSSndJYTplbkFfSk5mWkphNTBzazZTQXY2RVVzSGRIbTRh");

        if (conn.getResponseCode() == 200) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String response = reader.readLine();
                accessToken = extractValue(response, "access_token"+':'+"", "\"");
                System.out.println("Access Token Retrieved: " + accessToken);
            }
        } else {
            throw new Exception("Failed to retrieve access token: " + conn.getResponseMessage());
        }
    }

    private static void generateCartIds() {
        for (int i = 0; i < 3000; i++) {
            try {
                String cartIdResponse = getCartId();
                String cartId = extractValue(cartIdResponse, "id"+':'+"", "\"");

                if (cartId == null || cartId.isEmpty()) {
                    throw new Exception("Invalid cart ID response: " + cartIdResponse);
                }

                System.out.println("Generated Cart ID: " + cartId);
                writeFile(CART_IDS_OUTPUT_FILE, cartId);
                addProductsToCart(cartId);
            } catch (Exception e) {
                System.err.println("Error processing cart ID " + i + ": " + e.getMessage());
            }
        }
        System.out.println("Completed generating cart IDs.");
    }

    private static String getCartId() throws Exception {
        URL url = new URL("https://devcloud-api.medline.com/ecom/cart/v1/carts");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + accessToken);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        String payload = "{\"shipTo\":\"1000843\"}";
        try (OutputStream os = conn.getOutputStream()) {
            os.write(payload.getBytes());
            os.flush();
        }

        if (conn.getResponseCode() == 200) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                return reader.readLine();
            }
        } else {
            throw new Exception("Failed to generate cart ID: " + conn.getResponseMessage());
        }
    }

    private static void addProductsToCart(String cartId) throws Exception {
        URL url = new URL("https://devcloud-api.medline.com/ecom/cart/v1/carts/" + cartId + "/items/add");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + accessToken);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        Random random = new Random();
        int randNumber = random.nextInt(10) + 1;
        StringBuilder lineItems = new StringBuilder("[");

        for (int i = 0; i < randNumber; i++) {
            if (i > 0) lineItems.append(",");
            lineItems.append("{\"id\":\"item-").append(i).append("\",\"quantity\":").append(random.nextInt(5) + 1).append("}");
        }
        lineItems.append("]");

        try (OutputStream os = conn.getOutputStream()) {
            os.write(lineItems.toString().getBytes());
            os.flush();
        }

        if (conn.getResponseCode() == 200) {
            System.out.println("Products added to cart " + cartId);
        } else {
            throw new Exception("Failed to add products to cart: " + conn.getResponseMessage());
        }
    }

    private static String extractValue(String source, String start, String end) {
        int startIndex = source.indexOf(start) + start.length();
        int endIndex = source.indexOf(end, startIndex);
        return startIndex >= 0 && endIndex >= 0 ? source.substring(startIndex, endIndex) : null;
    }
}
