public interface AuctionMedaiator {
    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder, int bidAmount);
}
