import java.util.Scanner;
public class Lesson_04
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Lesson_04 receipt = new Lesson_04();
		
		System.out.println("Enter your first item");
		String item1 = input.nextLine();
		System.out.println("Ener he price of your first item");
		double price1 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Enter your second item");
		String item2 = input.nextLine();
		System.out.println("Ener he price of your second item");
		double price2 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Enter your third item");
		String item3 = input.nextLine();
		System.out.println("Ener he price of your third item");
		double price3 = input.nextDouble();
		
		System.out.println("----------- Receipt -----------");
		receipt.printReceipt(item1, price1);
		receipt.printReceipt(item2, price2);
		receipt.printReceipt(item3, price3);
		System.out.println("\n");
		receipt.printReceipt("Subtotal: ", price1+price2+price3);
		receipt.printReceipt("Subtotal: ", (price1+price2+price3)*(0.09));
		receipt.printReceipt("Subotal : ", (price1+price2+price3)*(1.09));
		System.out.println("\n________________________________________");
		System.out.println(" Thank you!");
		
	}
		
	public void printReceipt(String item, double price)
	{
		System.out.printf("\n* %15s ........\t %5.2f", item, price);
		
	}
}