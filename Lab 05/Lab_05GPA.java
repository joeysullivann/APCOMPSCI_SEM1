import java.util.Scanner;

public class Lab_05GPA
{
	static double gpa;
	
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("What is the letter of your first grade?");
		String g1 = js.nextLine();
		System.out.println("What is the letter of your second grade?");
		String g2 = js.nextLine();
		System.out.println("What is the letter of your third grade?");
		String g3 = js.nextLine();
		System.out.println("What is the letter of your fourth grade?");
		String g4 = js.nextLine();
		System.out.println("What is the letter of your fifth grade?");
		String g5 = js.nextLine();
		System.out.println("What is the letter of your sixth grade?");
		String g6 = js.nextLine();
		System.out.println("What is the letter of your seventh grade?");
		String g7 = js.nextLine();
		
		double gpa1 = calcPoints(g1);
		double gpa2 = calcPoints(g2);
		double gpa3 = calcPoints(g3);
		double gpa4 = calcPoints(g4);
		double gpa5 = calcPoints(g5);
		double gpa6 = calcPoints(g6);
		double gpa7 = calcPoints(g7);
		double totalGPA = (gpa1 + gpa2 + gpa3 + gpa4 + gpa5 + gpa6 + gpa7)/7;
		System.out.printf("Your GPA is %4.2f", totalGPA);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
		{
			return gpa = 4.0;
		}
		if (grade.equals("B"))
		{
			return gpa = 3.0;
		}
		if (grade.equals("C"))
		{
			return gpa = 2.0;
		}
		if (grade.equals("D"))
		{
			return gpa = 1.0;
		}
		if (grade.equals("F"))
		{
			return gpa = 0.0;
		}
		return gpa;
	}
}