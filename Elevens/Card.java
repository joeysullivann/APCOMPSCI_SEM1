public class Card {
	private String suit;
	private String rank;
	private int pointValue;
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		suit = cardSuit;
		rank = cardRank;
		pointValue = cardPointValue;
	}
	public String suit() {
		return suit;
   }
	public String rank() {
		return rank;
	}
	public int pointValue() {
		return pointValue;
	}
	public boolean matches(Card otherCard) {
		if (otherCard.rank().equals(this.rank()))
		{
			if (otherCard.suit().equals(this.suit()))
			{
				if (otherCard.pointValue() == this.pointValue())
				{
					return true;
				}
			}
		}
		return false;
	}
	public String toString() {
		return this.rank() + " of " + this.suit() + " (point value = " + this.pointValue() + ")";
	}
}
