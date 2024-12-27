public class Bidder implements Colleague{
    String name;
    AuctionMedaiator auctionMedaiator;
    public Bidder(String name, AuctionMedaiator auctionMedaiator) {
        this.name = name;
        this.auctionMedaiator = auctionMedaiator;
        auctionMedaiator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMedaiator.placeBid(this,bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder: "+name+" got the notification that someone has put bid of : "+bidAmount);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
