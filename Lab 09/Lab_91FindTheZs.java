import java.util.Scanner;
public class Lab_91FindTheZs{
	static String Array = "";
	public static void main(String[]args){
		String [] word = new String[5];
		fillArray(word);
		System.out.println("For the words:  " + printArray(word));
		System.out.println(hasZs(word) + "contain(s) the letter z.");
	}
	public static void fillArray(String[] wording){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your 5 words:");
		for (int j = 0; j < wording.length; j++){
			wording[j] = js.next();
		}
	}

	public static String printArray(String[] wor){
		for (String w: wor){
			Array += w + " ";
		}
		return Array;
	}
	public static String hasZs(String[] language){
		String zs = "";
		for (String wo: language){
			if (wo.indexOf("z") >= 0){
				zs += wo + " ";
			}
			else{
				zs += "";
			}
		}
		return zs;
	}
}