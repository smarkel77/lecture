package com.techelevator.auction;

import java.util.ArrayList;
import java.util.List;

public class AuctionDemo {

	public static void main(String[] args) {
		

		List<Auction> listOfAuctions = new ArrayList<Auction>();
		
		Auction s6Auction = new Auction("Audi S6");
		listOfAuctions.add(s6Auction);
		
		ReserveAuction a8Auction = new ReserveAuction("Audi A8", 10000);
		listOfAuctions.add(a8Auction);

		
		BuyoutAuction a4Auction = new BuyoutAuction("Audi A4", 10000);		
		listOfAuctions.add(a4Auction);
		
		
		Bid firstBid = new Bid("Tom", 2000);
		Bid secondBid = new Bid("Justin", 20000);
		Bid thirdBid = new Bid("Andrew", 30000);
		
		for(Auction a : listOfAuctions) {
			a.placeBid(firstBid);
			a.placeBid(secondBid);
			a.placeBid(thirdBid);
		}
		
		for(Auction a : listOfAuctions) {
			Bid winner = a.getHighBid();
			System.out.println("Auction for " + a.getItemForSale() + " winner is: ");
			System.out.println(winner.getBidder() + " with a bid of " + winner.getBidAmount());
			System.out.println("All bids:");
			List<Bid> allBids = a.getAllBids();
			for(Bid b : allBids) {
				System.out.println("\t" + b.getBidder() + ": " + b.getBidAmount());
			}
			System.out.println("\n");
			
			
		}
		
		
		
/*		
		a8Auction.placeBid(firstBid);
		a8Auction.placeBid(secondBid);
		
		List<Bid> currentBidsOnA8 = a8Auction.getAllBids();
		
		for(Bid b : currentBidsOnA8) {
			System.out.println("Bidder: " + b.getBidder() + " bid " + b.getBidAmount() + " dollars.");
		}
	*/	
		
	}

}
