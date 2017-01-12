import java.util.Scanner;
public class Lab_11Divisor{
public static void main(String[]args){
		int [][] numbers = new int [4][4];
		Scanner js = new Scanner(System.in);
		for (int j = 0; j < numbers.length; j++){
			for (int s = 0; s < numbers[j].length; s++){
				numbers[j][s] = 1 + (int)((Math.random()*100));
				System.out.print(numbers[j][s] + "\t");
			}
			System.out.println("");
		}
		System.out.println("Enter in your numer:");
		int d = js.nextInt();
		int c = 0;
		for (int j = 0; j < numbers.length; j++){
			for (int s = 0; s < numbers[j].length; s++){
				if (numbers[j][s] % d == 0){
					c += 1;
				}
			}
		}
		System.out.println("There are " + c + " numbers divisible by " + d + " in the array.");
	}
}


