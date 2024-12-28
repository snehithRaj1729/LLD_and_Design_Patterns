package Element;

import Visitor.RoomVisitor;

public class DoubleRoomElement implements RoomElement{
    public int price=0;
    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }
}
