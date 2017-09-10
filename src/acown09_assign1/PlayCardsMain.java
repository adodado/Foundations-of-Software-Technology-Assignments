package acown09_assign1;

/**
 * Created by: Admir Cosic, 2017-08-28
 * Last changed by: Admir Cosic, 2017-09-10
 *
 * Exercise 12: Deck
 */

public class PlayCardsMain {
	public static void main(String[] args) {
		int handSize = 7;
		Deck deck = new Deck();

		String[] startupMessage = { "Deck size: " + deck.deckSize(),"\n", "Shuffling.......","\n","Dealing cards.....","\n","\n"};
		printStringArray(startupMessage);
		deck.shuffle();

		for(int i = 0; i < handSize; i++) {
			Card card = deck.handOutNextCard();
			String[] dealtCards = { "Value: " + card.getValue(),"\n", "Rank: " + card.getRank(),"\n","Suite: " + card.getSuite(),"\n"};
			printStringArray(dealtCards);
		}
		String[] endMessage = { "\n","\n","You were dealt "+ handSize + " cards.", "\n","There are " + deck.deckSize()+ " cards left in the deck!"};
		printStringArray(endMessage);
	}

	private static void printStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
	}
}