import Product.VechicleType;
import Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VechicleInventoryManager inventoryManager;
    Location location;
    List<Reservation> reservationList = new ArrayList<>();

    public List<Vehicle> getVechicles(VechicleType vechicleType){
        return inventoryManager.getVechicles();
    }

    public void setVehicles(List<Vehicle> vehicles){
        inventoryManager = new VechicleInventoryManager(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle,User user){
        Reservation reservation = new Reservation();
        reservation.createReservation(user,vehicle);
        reservationList.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId){
        // take out the reservation from the list and call complete function
        return true;
    }

    public List<Vehicle> geVehicles(VechicleType vechicleType) {
    }
}
