import java.util.Scanner;

public class Lab_05E2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Lab_05E2 receipt = new Lab_05E2();
		
		System.out.println("What is your first item?");
		String i1 = input.nextLine();
		System.out.println("What is the price of your first item? ");
		double p1 = input.nextDouble();
		
		input.nextLine();
		System.out.println("What is your second item? ");
		String i2 = input.nextLine();
		System.out.println("What is the price of your first item? ");
		double p2 = input.nextDouble();
		
		input.nextLine();
		System.out.println("What is your third item? ");
		String i3 = input.nextLine();
		System.out.println("What is the price of our third item? ");
		double p3 = input.nextDouble();
		
		double subTotal = p1+p2+p3;
		double discounted = subTotal - (discount(subTotal));
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		receipt.printReceipt(i1, p1);
		receipt.printReceipt(i2, p2);
		receipt.printReceipt(i3, p3);
		System.out.println("\n");
		receipt.printReceipt("Subtotal:", subTotal);
		receipt.printReceipt("Discount: ", discount(subTotal));
		receipt.printReceipt("Tax: ", discounted * 0.08);
		receipt.printReceipt("Total:", discounted * 1.08);
		System.out.println("\n________________________________________");
		System.out.println("* Thank you for your support *");
		
	}
	
		public void printReceipt(String item, double price)
		{		
			System.out.printf("\n* %15s ........\t %5.2f", item, price);
		}
		public static double discount(double total)
		{
			double dis = 0;
			if (total >= 2000)
				dis = total*0.15;
			if (total < 2000)
				dis = 0;
			return dis;
			
		}
}