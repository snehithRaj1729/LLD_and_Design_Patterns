import Element.DeluxRoomElement;
import Element.DoubleRoomElement;
import Element.RoomElement;
import Element.SingleRoomElement;
import Visitor.RoomMaintainanceVisitor;
import Visitor.RoomPricingVisitor;
import Visitor.RoomVisitor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RoomElement singleRoomObj = new SingleRoomElement();
        RoomElement doubleRoomObj = new DoubleRoomElement();
        RoomElement deluxRoomObj = new DeluxRoomElement();

        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();
        singleRoomObj.accept(pricingVisitorObj);
        System.out.println(((SingleRoomElement) singleRoomObj).price);

        doubleRoomObj.accept(pricingVisitorObj);
        System.out.println(((DoubleRoomElement) doubleRoomObj).price);

        RoomVisitor maintenanceVisitorObj = new RoomMaintainanceVisitor();
        singleRoomObj.accept(maintenanceVisitorObj);
        doubleRoomObj.accept(maintenanceVisitorObj);
        deluxRoomObj.accept(maintenanceVisitorObj);
    }
}