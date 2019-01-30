package com.techelevator.game;

public abstract class Game {
	
	private int numberOfPlayers;
	
	public Game(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	protected abstract void setup(int numberOfPlayers);
	
	protected abstract void takeTurn(int player);
	
	protected abstract boolean isGameOver();
	
	protected abstract void finishGame();
	
	public final void playGame() {
		setup(numberOfPlayers);
		for(int i = 1; !isGameOver(); i = (i % numberOfPlayers) + 1) {
			takeTurn(i);
		}
		finishGame();
	}
}
