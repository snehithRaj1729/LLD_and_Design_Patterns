package WithCommandDesignPattern;

import java.util.Stack;

public class MyRemoteControl {
    Stack<ICommand> iCommandStack = new Stack<>();
    ICommand iCommand;

    public MyRemoteControl() {
    }

    public void setCommand(ICommand iCommand){
        this.iCommand=iCommand;
    }

    public void pressButton(){
        iCommand.execute();
        iCommandStack.add(iCommand);
    }

    public void undo(){
        if(!iCommandStack.isEmpty()){
            ICommand lastCommand = iCommandStack.pop();
            lastCommand.undo();
        }
    }

}
