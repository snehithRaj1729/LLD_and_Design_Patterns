import Product.Vehicle;

import java.util.List;

public class VechicleInventoryManager {
    List<Vehicle> vehicles;
    public VechicleInventoryManager(List<Vehicle> vehicles) {
        this.vehicles=vehicles;
    }

    public List<Vehicle> getVechicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles){
        this.vehicles=vehicles;
    }
}
