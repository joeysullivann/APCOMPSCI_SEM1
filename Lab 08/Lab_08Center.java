import java.util.Scanner;
public class Lab_08Center{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter your first word:");
		String w1 = js.nextLine();
		System.out.println("Ener your second word:");
		String w2 = js.nextLine();
		System.out.println("Enter your third word:");
		String w3 = js.nextLine();
		System.out.println(makeCenter(w1));
		System.out.println(makeCenter(w2));
		System.out.println(makeCenter(w3));
	}
	public static String makeCenter(String W){
		if (W.length() >= 20){
			return W;
		}
		else{
			return makeCenter(" " + W + " ");
		}
	}
}