public class ElevatorCar {
    int id;
    ElevatorDisplay elevatorDisplay;
    InternalButtons internalButtons;
    ElevatorState elevatorState;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    public ElevatorCar(){
        this.elevatorDisplay = new ElevatorDisplay();
        this.internalButtons = new InternalButtons();
        elevatorState=ElevatorState.IDLE;
        currentFloor=0;
        elevatorDirection=Direction.UP;
        elevatorDoor=new ElevatorDoor();
    }
    public void showDisplay(){
        elevatorDisplay.showDisplay();
    }
    public void pressButton(int destinationFloor){
        internalButtons.pressButton(destinationFloor,this);
    }
    public void setDisplay(){
        this.elevatorDisplay.setDisplay(currentFloor,elevatorDirection);
    }
    boolean moveElevator(Direction dir,int destinationFloor){
        int startFloor = currentFloor;
        if(dir==Direction.UP){
            for(int i=startFloor;i<=destinationFloor;++i){
                this.currentFloor=startFloor;
                setDisplay();
                showDisplay();
                if(i==destinationFloor){
                    return true;
                }
            }
        }
        if(dir==Direction.DOWN){
            for(int i=startFloor;i>=destinationFloor;--i){
                this.currentFloor=startFloor;
                setDisplay();
                showDisplay();
                if(i==destinationFloor){
                    return true;
                }
            }
        }
        return false;
    }
}
