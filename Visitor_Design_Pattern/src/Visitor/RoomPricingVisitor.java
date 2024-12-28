package Visitor;

import Element.DeluxRoomElement;
import Element.DoubleRoomElement;
import Element.RoomElement;
import Element.SingleRoomElement;

public class RoomPricingVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoomElement singleRoomElement) {
        System.out.println("Pricing computation logic of singleRoom: ");
        singleRoomElement.price=1000;
    }

    @Override
    public void visit(DoubleRoomElement doubleRoomElement) {
        System.out.println("Pricing computation logic of doubleRoom: ");
        doubleRoomElement.price=2000;
    }

    @Override
    public void visit(DeluxRoomElement deluxRoomElement) {
        System.out.println("Pricing computation logic of deluxRoom: ");
        deluxRoomElement.price=3000;
    }
}
