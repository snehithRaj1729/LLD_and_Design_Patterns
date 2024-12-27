import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMedaiator{

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Bidder bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int bidAmount) {
        for(Colleague colleague:colleagues){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.receiveBidNotification(bidAmount);
            }
        }
    }
}
