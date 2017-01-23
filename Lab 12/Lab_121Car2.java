import java.util.Scanner;
public class Lab_121Car2{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Paint:");
		String inpaint = js.nextLine();
		System.out.println("Interior:");
		String ininterior = js.nextLine();
		System.out.println("Engine:");
		String inengine = js.nextLine();
		System.out.println("Tires:");
		String intires = js.nextLine();
		Lab_121Car obj = new Lab_121Car(inpaint, ininterior, inengine, intires);
		System.out.println("Your vehicle is ready:");
		System.out.println("Paint:\t\t" + obj.getp());
		System.out.println("Interior:\t\t" + obj.geti());
		System.out.println("Engine:\t\t" + obj.gete());
		System.out.println("Tires:\t\t" + obj.gett());
	}
}
