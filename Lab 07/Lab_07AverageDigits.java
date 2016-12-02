import java.util.Scanner;
public class Lab_07AverageDigits{
	static int number;
	static int num;
	static double average = 0;
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your number: ");
		number = js.nextInt();
		num = number;
	
		System.out.println("The average of the digits in " + number + " is " + avDigits());
		
	}
	public static double avDigits(){
		double digits = 0;
		while (num > 0){
			digits++;
			average += (num % 10);
			num /= 10;
		}
		return average/digits;
	}
}