package Element;

import Visitor.RoomVisitor;

public class SingleRoomElement implements RoomElement{
    public int price=0;
    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }
}
