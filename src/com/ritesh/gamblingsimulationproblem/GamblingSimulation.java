package com.ritesh.gamblingsimulationproblem;

public class GamblingSimulation {
	
	private static final int EVERY_DAY_STACK=100;
	private static final int PER_GAME_BET=1;
	
	public static void gameStatus() {
		
		System.out.println("Every Day Stack = "+EVERY_DAY_STACK);
		System.out.println("Per Game Bet = "+PER_GAME_BET);
	}
	
	public static void main(String[] args) {
		
	System.out.println("Wellcome To Gambling Simulation Program ");
	
	gameStatus();
	
	}
	
}
