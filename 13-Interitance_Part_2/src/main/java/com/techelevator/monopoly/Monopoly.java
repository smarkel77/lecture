package com.techelevator.monopoly;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.techelevator.game.Game;

public class Monopoly extends Game {

	private static final String[] PIECES = { "Dog", "Wheelbarrow", "Thimble", "Car", "Iron", "Hat", "Shoe", "Battleship", "Cannon" };
	private int numberOfPlayers;
	private List<Player> players = new ArrayList<Player>();
	private Random rando;
	
	
	public Monopoly(int numberOfPlayers) {
		super(numberOfPlayers);
		this.numberOfPlayers = numberOfPlayers;
		this.rando = new Random();
	}

	protected void setup(int numberOfPlayers) {
		System.out.println("Distributing money!");
		for(int i = 0; i < numberOfPlayers && i < PIECES.length; i++) {
			Player p = new Player((i+1), PIECES[i]);
			players.add(p);
			System.out.println("Created player! " + p);
		}
	}

	protected void takeTurn(int player) {
		Player currentPlayer = players.get(player - 1);

		if(!currentPlayer.isBankrupt()) {
			System.out.println(currentPlayer + " is taking a turn.");
		
			if(rando.nextInt(numberOfPlayers) % 3 == 0) {
				currentPlayer.goBankrupt();
				System.out.println(currentPlayer + " is BANKRUPT!");
			}
		}
	}

	protected boolean isGameOver() {
		return getActivePlayers().size() == 1;
	}
	
	private List<Player> getActivePlayers() {
		List<Player> activePlayers = new ArrayList<Player>();

		for(Player p : players) {
			if(!p.isBankrupt()) {
				activePlayers.add(p);
			}
		}
		
		return activePlayers;
	}

	protected void finishGame() {
		Player winner = getActivePlayers().get(0);
		System.out.println(winner + " IS THE WINNER!!!");
	}
}
