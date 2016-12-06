import java.util.Scanner;
public class Lab_09FibonacciSequence{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your starting number:");
		int start = js.nextInt();
		System.out.println("Enter in your sequence size:");
		int size = js.nextInt();
		int [] seq = new int[size];

		for (int j = 0; j < seq.length; j++){
			if (j == 0 || j == 1){
				seq[j] = start;
			}
			else{
				seq[j] = seq[j-1] + seq [j-2];
			}
			System.out.print(seq[j] + " ");
		}
	}
}
