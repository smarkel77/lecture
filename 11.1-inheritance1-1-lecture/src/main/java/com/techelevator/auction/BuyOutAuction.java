package com.techelevator.auction;

public class BuyOutAuction extends Auction {
	
	
	private int buyItNow;
	
	public BuyOutAuction(String itemForSale, int buyOutPrice) {
		super(itemForSale);
		this.buyItNow = buyOutPrice;
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
		return buyItNow;
	}
	
	

}
