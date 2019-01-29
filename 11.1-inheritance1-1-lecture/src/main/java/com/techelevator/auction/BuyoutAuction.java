package com.techelevator.auction;

public class BuyoutAuction extends Auction {

	private int buyItNow;
	
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super(itemForSale);
		this.buyItNow = buyoutPrice;
	}

	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		
		if(getHighBid().getBidAmount() < buyItNow) {
			if(offeredBid.getBidAmount() > buyItNow) {
				offeredBid = new Bid(offeredBid.getBidder(), buyItNow);
			}
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		
		return isCurrentWinningBid;
	}
	
	
	
	public int getBuyItNow() {
		return this.buyItNow;
	}
	
}
