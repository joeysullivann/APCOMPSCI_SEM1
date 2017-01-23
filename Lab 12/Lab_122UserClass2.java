import java.util.Scanner;
public class Lab_122UserClass2{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("First name: ");
		String infn = js.nextLine();
		System.out.println("Last name: ");
		String inln = js.nextLine();
		System.out.println("Avatar? (Y/N)");
		String ina = js.nextLine();
		if (ina.equals("Y")){
			System.out.println("Avatar: ");
			String AAA = js.nextLine();
			Lab_122UserClass avud = new Lab_122UserClass(infn, inln, ina);
			avud.seta(AAA);
			System.out.println(avud);
		}
		if (ina.equals("N")){
			Lab_122UserClass noud = new Lab_122UserClass(infn, inln);
			System.out.println(noud);
		}
	}
}
