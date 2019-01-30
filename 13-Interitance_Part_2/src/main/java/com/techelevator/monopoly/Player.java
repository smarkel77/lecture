package com.techelevator.monopoly;

public class Player {
	private int playerNumber;
	private String playerPiece;
	private boolean isBankrupt;
	
	public Player(int playerNumber, String playerPiece) {
		this.playerNumber = playerNumber;
		this.playerPiece = playerPiece;
		this.isBankrupt = false;
	}
	
	
	public boolean isBankrupt() {
		return isBankrupt;
	}

	public void goBankrupt() {
		this.isBankrupt = true;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public String getPlayerPiece() {
		return playerPiece;
	}
	
	public String toString() {
		return "Player #" + playerNumber + ": " + playerPiece;
	}
	
}
