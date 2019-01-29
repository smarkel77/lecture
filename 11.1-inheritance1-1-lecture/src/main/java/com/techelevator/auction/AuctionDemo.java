package com.techelevator.auction;

import java.util.List;

public class AuctionDemo {

	public static void main(String[] args) {
		

		ReserveAuction a8Auction = new ReserveAuction("Audi A8", 10000);
		
		Bid firstBid = new Bid("Tom", 2000);
		Bid secondBid = new Bid("Justin", 20000);
		
		a8Auction.placeBid(firstBid);
		a8Auction.placeBid(secondBid);
		
		List<Bid> currentBidsOnA8 = a8Auction.getAllBids();
		
		for(Bid b : currentBidsOnA8) {
			System.out.println("Bidder: " + b.getBidder() + " bid " + b.getBidAmount() + " dollars.");
		}
		
		
	}

}
