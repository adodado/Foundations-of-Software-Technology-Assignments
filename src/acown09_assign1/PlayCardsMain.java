package acown09_assign1;

/**
 * Created by: Admir Cosic, 2017-08-28
 * Last changed by: Admir Cosic, 2017-08-31
 *
 * Exercise 12: Deck
 */

public class PlayCardsMain {
	public static void main(String[] args) {
		int handSize = 7;
		Deck deck = new Deck();

		System.out.println("Deck size: " + deck.deckSize());
		System.out.println("Shuffling deck...\n--------------------------------------\n");
		deck.shuffle();

		System.out.println("Handing out cards.\n");

		for(int i = 0; i < handSize; i++) {
			Card card = deck.handOutNextCard();
			
			System.out.println("Card value: " + card.getValue() + " - You got card: " + card.getRank() + " of " + card.getSuite());
		}
		
		System.out.println("\n--------------------------------------\nYou got dealt " + handSize + " cards.");
		System.out.println("Cards left in deck: " + deck.deckSize());
	}
}