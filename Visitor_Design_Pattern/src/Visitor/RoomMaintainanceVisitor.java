package Visitor;

import Element.DeluxRoomElement;
import Element.DoubleRoomElement;
import Element.SingleRoomElement;

public class RoomMaintainanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoomElement singleRoomElement) {
        System.out.println("Performing maintenance of singleRoom");
    }

    @Override
    public void visit(DoubleRoomElement doubleRoomElement) {
        System.out.println("Performing maintenance of doubleRoom");
    }

    @Override
    public void visit(DeluxRoomElement deluxRoomElement) {
        System.out.println("Performing maintenance of deluxRoom");
    }
}
