import java.util.Scanner;
public class Lab_07ReverseNumber
{
	static int rev = 0;
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your number: ");
		int inNum = js.nextInt();
		System.out.println(inNum + " reversed is " + getReverse(inNum));
	}
	public static int getReverse(int number)
	{
		while (number>0)
		{
			rev*= 10;
			rev +=number % 10;
			number /= 10;
		}
		return (rev);
	}
}