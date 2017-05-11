import java.util.List;
import java.util.ArrayList;
public class Deck {
	private List<Card> cards;
	private int size;
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++)
		{
			for (String suit : suits)
			{
				cards.add(new Card(ranks[i], suit, values[i]));
			}
		}
		size = cards.size();
		shuffle();
	}
	public boolean isEmpty() {
		if (size == 0)
		{
			return true;
		}
		return false;
	}
	public int size() {
		return size;
	}
	public void shuffle()
	{
		for(int j = size - 1; j >= 0; j-- ) 
		{
			int r = (int)(Math.random() * j);
			Card temp = cards.get(r);
			cards.set(r, cards.get(j));
			cards.set(j, temp);
		}
	}
	public Card deal() {
		if (isEmpty()) 
		{
			return null;
		}
		size--;
		Card csize = cards.get(size);
		return csize;
	}
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";
		for (int j = size - 1; j >= 0; j--) {
			rtn = rtn + cards.get(j);
			if (j != 0) {
				rtn = rtn + ", ";
			}
			if ((size - j) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\nDealt cards: \n";
		for (int j = cards.size() - 1; j >= size; j--) {
			rtn = rtn + cards.get(j);
			if (j != size) {
				rtn = rtn + ", ";
			}
			if ((j - cards.size()) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\n";
		return rtn;
	}
}
