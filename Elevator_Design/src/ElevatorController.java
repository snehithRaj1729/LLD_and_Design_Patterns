import java.util.PriorityQueue;

public class ElevatorController {
    ElevatorCar elevatorCar;
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;

    ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar=elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b)->b-a);
    }

    public void submitExternalRequest(int floor,Direction direction){
        if(direction==Direction.DOWN){
            downMaxPQ.add(floor);
        }else{
            upMinPQ.add(floor);
        }
    }
}
