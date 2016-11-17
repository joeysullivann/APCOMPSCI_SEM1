import java.util.Scanner;
public class Lab_08Lucky7s{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter your number: ");
		System.out.println(seven(js.nextInt()));
	}
	public static int seven(int seven){
		if (seven > 0)
		{
			if (seven % 10 == 7){
				return 1 + (seven(seven/10));
			}
			else{
				return 0 + (seven(seven/10));
			}
		}
		else{
			return 0;
		}
	}
}
