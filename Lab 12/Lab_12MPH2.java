import java.util.Scanner;
public class Lab_12MPH2{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter your distance in miles: ");
		int distance = js.nextInt();
		System.out.println("Enter in your hours:");
		int hours = js.nextInt();
		System.out.println("Enter in your minutes:");
		int minutes = js.nextInt();
		Lab_12MPH obj = new Lab_12MPH(10, 2, 0);
		System.out.println(obj.getd() + " miles in " + obj.geth() + " hours and " + obj.getm() + " minutes = " + obj.getmph() + " mph");
		obj.setValues(distance, hours, minutes);
		System.out.println("\nUser Your Input:");
		System.out.println(obj.getd() + " miles in " + obj.geth() + " hours and " + obj.getm() + " minutes = " + obj.getmph() + " mph");
	}
}
