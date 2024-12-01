import Product.Car;
import Product.VechicleType;
import Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<User> userList = addUsers();
        List<Vehicle> vehicleList = addVehicles();
        List<Store> storeList = addStores(vehicleList);
        VechicleRentalSystem rentalSystem = new VechicleRentalSystem(storeList,userList);

        User user = userList.get(0); //(0) user 0 comes

        // (1) User searches for store based on location
        Location location = new Location(403012,"Banglore","karnataka","India");
        Store store = rentalSystem.getStore(location);

        //(2) get all vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.geVehicles(VechicleType.CAR);

        //(3) reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0),userList.get(0));

        //(4) generate Bill
        Bill bill = new Bill(reservation);

        //(5) make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //(6) trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.reservatoinId);
    }

    private static List<Vehicle> addVehicles() {
        List<Vehicle> vechicles = new ArrayList<>();
        Vehicle vehicle1 = new Car();
        vehicle1.setVechicleId(1);
        vehicle1.setVechicleType(VechicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle2.setVechicleId(2);
        vehicle2.setVechicleType(VechicleType.CAR);

        vechicles.add(vehicle1);
        vechicles.add(vehicle2);

        return  vechicles;

    }

    public static List<User> addUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);

        return users;
    }

    private static List<Store> addStores(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);
        stores.add(store1);
        return stores;
    }

}