package Visitor;

import Element.DeluxRoomElement;
import Element.DoubleRoomElement;
import Element.RoomElement;
import Element.SingleRoomElement;

public interface RoomVisitor {
    public void visit(SingleRoomElement singleRoomElement);
    public void visit(DoubleRoomElement doubleRoomElement);
    public void visit(DeluxRoomElement deluxRoomElement);
}
