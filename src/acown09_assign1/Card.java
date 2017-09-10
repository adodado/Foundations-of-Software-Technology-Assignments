package acown09_assign1;

/**
 * Created by: Admir Cosic, 2017-08-28
 * Last changed by: Admir Cosic, 2017-09-10
 *
 * Exercise 12: Deck
 */

public class Card {
	
	public enum Suite {
		Spades, Clubs, Hearts, Diamonds;
	}
	
	public enum Rank {
		Ace, Two, Three, Four, Five, Six, Seven, Eight,
		Nine, Ten, Jack, Queen, King
	}
	
	private Suite suite;
	private Rank rank;
	private int value;
	
	public Card(Suite cardSuite, Rank cardRank, int cardValue) {
		suite = cardSuite;
		rank = cardRank;
		value = cardValue;
	}
	
	public Suite getSuite() {
		return suite;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public int getValue() {
		return value;
	}
}