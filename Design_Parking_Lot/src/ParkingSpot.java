public class ParkingSpot {
    int parkingSpotId;
    boolean isSpotEmpty;
    Vechicle vechicle;
    int price;

    void ParkVechicle(Vechicle vechicle){
        this.vechicle=vechicle;
        this.isSpotEmpty=false;
    }
    void RemoveVechile(){
        this.vechicle=null;
        this.isSpotEmpty=true;
    }
}
