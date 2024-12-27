//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AuctionMedaiator auctionMedaiator = new Auction();
        Colleague bidder1 = new Bidder("A",auctionMedaiator);
        Colleague bidder2 = new Bidder("B",auctionMedaiator);

        bidder1.placeBid(2000);
        bidder2.placeBid(3000);
        bidder1.placeBid(4000);
    }
}