package acown09_assign1;

import java.text.DecimalFormat;

/**
 * Created by: Admir Cosic, 2017-08-28
 * Last changed by: Admir Cosic, 2017-09-10
 *
 * Exercise 13: Game 1-2-3
 */

public class Play123Main {

	public static void main(String[] args) {
		int wins = 0;
		int losses = 0;
		int iteration = 0;
		boolean end = false;
		
		while(!end){
		  iteration++;
		  Deck deck = new Deck();
			deck.shuffle();
			
			if(play123(deck)) {
				wins++;
			}
			else {
				losses++;
			}
		  if(iteration > 10000){
		   end = true;
		  }
		}
		double winProbability = (double)wins/10000*100;
		printResults(10000, wins, losses, winProbability);
	}
	
	public static boolean play123(Deck deck) {
		int counter = 1;
		int iteration =0;
		boolean end = false;
		
		 while(!end){
			 iteration++;
			 if(counter == 3) {
					counter = 1;
				}
				Card card = deck.handOutNextCard();
				if(card.getValue() == counter) {
					return false;
				}
				counter++;
			  if(iteration >= 52){
				   end = true;
				  }
		}
		return true;
	}
	
	public static void printResults(int timesToPlay, int wins, int losses, double probability) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		String[] results = {"Times played: " + timesToPlay,"\n", "Times won: " + wins,"\n","Times lost: " + losses,"\n","Probability of winning the game is: " + decimalFormat.format(probability) + "%"};
		printStringArray(results);
	}
	private static void printStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
	}
}