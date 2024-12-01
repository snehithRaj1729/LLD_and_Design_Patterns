import Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservatoinId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;


    public void createReservation(User user, Vehicle vehicle) {
    }
}
