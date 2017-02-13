public class Lab_13ToyRunner{
	public static void main(String[]args){
		Lab_13Store memes = new Lab_13Store("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(memes);
		System.out.println(memes.getMostFrequentToy());
		System.out.println(memes.getMostFrequentType());
	}
}