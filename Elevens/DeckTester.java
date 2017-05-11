public class DeckTester {
	public static void main(String[] args) 
	{
		String[] ranks1 = {"Jack", "Six", "Ace"};
		String[] suits1 = {"Hearts", "Clubs"};
		int[] values1 = {11, 6, 1};
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println(deck1.toString());
		System.out.println("Empty:" + deck1.deal());
		System.out.println("Size:" + deck1.size());
		System.out.println("---------------------------------");
		System.out.println("Deal:" + deck1.deal());
		System.out.println("---------------------------------");
		System.out.println("Shuffle");
		System.out.println("---------------------------------");
		System.out.println("Deal:" + deck1.deal());
		String[] ranks2 = new String[52];
        	String[] suits2 = new String[52];
        	int[] values2 = new int[52];
        	for (int i = 0; i < 52; i++) 
		{
            		String rank = "";
            		String suit = "";
            		if ((i+1) % 13 == 11) 
	    		{
                		rank = "Jack";
            		}
            		else if ((i+1) % 13 == 12) 
	    		{
                		rank = "Queen";
            		}
            		else if ((i+1) % 13 == 0) 
	    		{
                		rank = "King";
            		}
            		else if ((i+1) % 13 == 1) 
	    		{
                		rank = "Ace";
            		}
            		else 
	    		{
                		rank = Integer.toString((i + 1) % 13);
            		}
            
            		if (i < 13)
	    		{
                		suit = "Hearts";
            		}
            		else if (i < 26) 
	    		{
                		suit = "Diamonds";
            		}
            		else if (i < 39)
	    		{ 
                		suit = "Clubs";
            		}
            		else 
	    		{
                		suit = "Spades";
            		}
            
            		ranks2[i] = rank;
            		suits2[i] = suit;
            		values2[i] = ((i+1) % 13);
        		}
        
        	Deck deck2 = new Deck(ranks2, suits2, values2);
        	System.out.println(deck2);
	}
}
