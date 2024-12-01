import java.util.List;

public class Building {
     List<Floor> floorsList;
    Building(List<Floor> floorsList){
        this.floorsList=floorsList;
    }

    public void addFloor(Floor floor){
        this.floorsList.add(floor);
    }

    public void removeFloor(Floor floor){
        this.floorsList.remove(floor);
    }

    List<Floor> getAllFloorsList(){
        return this.floorsList;
    }
}
