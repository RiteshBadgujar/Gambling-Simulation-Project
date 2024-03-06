package com.ritesh.gamblingsimulationproblem;

import java.util.Random;

public class GamblingSimulation {
	
	private static final int EVERY_DAY_STACK=100;
	private static final int PER_GAME_BET=1;
	private static final int WIN=1;
	private static final int LOOSE=0;
	private static int winStack=0;
	private static int looseStack=0;
	static int playStatus;
	
	public static void gameStatus() {
		
		System.out.println("Every Day Stack = "+EVERY_DAY_STACK);
		System.out.println("Per Game Bet = "+PER_GAME_BET);
		System.out.println("Loose Game : "+looseStack);
		System.out.println("Win Game :"+winStack);
		System.out.println("-------------");
		
	}
	
	public static void gamePlay() {
		
		Random random=new Random();
		playStatus=random.nextInt(9)%2;
		
		if(playStatus == LOOSE) {
			
			looseStack+=1;
		}
		else {
			winStack+=1;
		}
	
	}
	
	public static void main(String[] args) {
		
	System.out.println("Wellcome To Gambling Simulation Program develop by Ritesh Badgujar");
	
	gameStatus();
	gamePlay();
	gameStatus();
	}
	
}
