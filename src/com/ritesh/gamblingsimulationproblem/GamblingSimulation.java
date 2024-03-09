package com.ritesh.gamblingsimulationproblem;

import java.util.Random;

public class GamblingSimulation {
	
	private static final int PER_DAY_STACK=100;
	private static final int PER_GAME_BET=1;
	private static final int WIN=1;
	private static final int LOOSE=0;
	
	private static final int[] winAmount = new int[20];
	private static final int[] looseAmount = new int[20];
	private static int[] maxwin=new int[20];
	private static int[] maxloose=new int[20];
	private static int winmax=0;
	private static int losemax=0;
	
	private static int winindex=0;
	private static int loseindex=0;
	

	static int playStatus;
	
	public static void gameStatus() {
		
		System.out.println("Every Day Stack = "+PER_DAY_STACK);
		System.out.println("Per Game Bet = "+PER_GAME_BET);
		
	}
	
	public static void gamePlay() {
		
		Random random=new Random();
		int total_win_day =0;
		int total_loose_day =0;
		
		for(int i = 0;i <20;i++) {
			
			 System.out.println("Day :"+(i+1));
			 int winStack=0;
			 int looseStack=0;
			
			while(true) {
				
				playStatus=random.nextInt(9)%2;
				
				if(playStatus == LOOSE) {
					
					looseStack += 1;
				}
				else {
					winStack += 1;
				}
				
				if(winStack == PER_DAY_STACK / 2 ) {
					total_win_day += 1;
					
				if(looseStack < winStack) {
					maxwin[i]=winStack - looseStack;
					if(winmax <maxwin[i]) {
						winmax=maxwin[i];
						winindex= i+1;
					}
						break;
					}
					break;
				}
				if( looseStack == PER_DAY_STACK / 2) {
					total_loose_day += 1;
					
					if(losemax  < looseStack) {
						
						 maxloose[i] = looseStack - winStack;
						if(losemax < maxloose[i]) {
							losemax=maxloose[i];
							loseindex= i+1;
							break;
					 }
					}
					
					break;
				   }	
			}
			
			winAmount[i]=winStack;
			looseAmount[i]=looseStack;
			
			System.out.println("Win Game : "+winStack);
			System.out.println("Loose Game : "+looseStack);
			System.out.println("-------------");	
			
		}
		System.out.println(loseindex+" Unlucky day , loss by Rs. : "+losemax);
		System.out.println(winindex +" Lucky day  & win By RS.  : "+winmax);
		System.out.println("Total Montly Win Day : "+total_win_day);
		System.out.println("Total Montly Loose Day : "+total_loose_day);
	 }
    
	public static void main(String[] args) {
		
	System.out.println("Wellcome To Gambling Simulation Program develop by Ritesh Badgujar");
	
	gamePlay();

	}
	
}
