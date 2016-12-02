import java.util.Scanner;
public class Lab_09AverageNumbers{	
	static int avg = 0;
	static int total	= 0;
	public static void main(String[]args){
		int [] num = new int[10];
		for (int j = 0; j < num.length; j++){
			num[j] = (int)((Math.random()*101));
		}
		System.out.println("Your Numbers:");
		for (int number: num){
			System.out.println(number + " ");
		}
		System.out.println("");
		System.out.println("The average of the above numbers is: " + average(num));
	}	
	public static int average(int[] digits){
		for (int num : digits){
			total += num;
		}
		return total/digits.length;
	}
}