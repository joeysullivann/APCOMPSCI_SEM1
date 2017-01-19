import java.util.Scanner;
public class Lab_12Distance2{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("x-coordinate of first point:");
		int xin1 = js.nextInt();
		System.out.println("y-coordinate of first point:");
		int yin1 = js.nextInt();
		System.out.println("x-coordinate of second point:");
		int xin2 = js.nextInt();
		System.out.println("y-coordinate of second point:");
		int yin2 = js.nextInt();
		Lab_12Distance obj = new Lab_12Distance(5, 6, 6, 6);
		System.out.println("The distance between (" + obj.getX1() + ", " + obj.getY1() + ")and (" + obj.getX2() + ", " + obj.getY2() +") is " + obj.getd());
		obj.setCoordinates(xin1, yin1, xin2, yin2);
		System.out.println("\nUser Inputs:");
		System.out.println("The distance between (" + obj.getX1() + ", " + obj.getY1() + ")and (" + obj.getX2() + ", " + obj.getY2() +") is " + obj.getd());
	}
}



