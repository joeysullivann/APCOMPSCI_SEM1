import java.util.Scanner;
public class Lesson_04
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		Lesson_04 receipt = new Lesson_04();
		
		System.out.println("Enter your first item");
		String i1 = js.nextLine();
		System.out.println("Etner the price of your first item");
		double p1 = js.nextDouble();
		
		js.nextLine();
		System.out.println("Enter your second item");
		String i2 = js.nextLine();
		System.out.println("Ener the price of your second item");
		double p2 = js.nextDouble();
		
		js.nextLine();
		System.out.println("Enter your third item");
		String i3 = js.nextLine();
		System.out.println("Ener the price of your third item");
		double p3 = js.nextDouble();
		
		System.out.println("----------- Receipt -----------");
		receipt.printReceipt(i1, p1);
		receipt.printReceipt(i2, p2);
		receipt.printReceipt(i3, p3);
		System.out.println("\n");
		receipt.printReceipt("Subtotal: ", p1+p2+p3);
		receipt.printReceipt("Subtotal: ", (p1+p2+p3)*(0.09));
		receipt.printReceipt("Subotal : ", (p1+p2+p3)*(1.09));
		System.out.println("\n________________________________________");
		System.out.println(" Thank you!");
		
	}
		
	public void printReceipt(String item, double price)
	{
		System.out.printf("\n* %15s ........\t %5.2f", item, price);
		
	}
}