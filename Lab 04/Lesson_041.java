import java.util.Scanner;
public class Lesson_041
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		Lesson_041 receipt = new Lesson_041();
		
		System.out.println("Enter your first name:");
		String i1 = js.nextLine();
		
		System.out.println("Enter your last name:");
		String i2 = js.nextLine();
		
		System.out.println("Enter your title:");
		String i3 = js.nextLine();
		
		System.out.println("Enter the school site:");
		String i4 = js.nextLine();
		
		System.out.println("Enter the school year:");
		String i5 = js.nextLine();
		
		System.out.println("Enter your subject:");
		String i6 = js.nextLine();
		
		System.out.println("----------------------------------------");
		receipt.printReceipt(i4, i5);
		receipt.printReceipt(i1, i2);
		receipt.printReceipt(i3, i6);
		System.out.println("----------------------------------------");
	}
	public void printReceipt(String item1, String item2)
	{
		System.out.printf("* %15s %20s *\n", item1, item2);
	}
}		