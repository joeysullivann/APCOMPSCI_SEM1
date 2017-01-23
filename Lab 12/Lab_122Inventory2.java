import java.util.Scanner;
public class Lab_122Inventory2{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Item name: ");
		String in = js.nextLine();
		System.out.println("Manufacturer: ");
		String manufacturer = js.nextLine();
		System.out.println("Will you be entering item category & price? (Y/N)");
		String response = js.nextLine();
		if (response.equals("Y")){
			System.out.println("Category: ");
			String category = js.nextLine();
			System.out.println("Item price: ");
			int price = js.nextInt();
			Lab_122Inventory yre = new Lab_122Inventory(manufacturer, in, category, price);
			System.out.println(yre);
		}
		if (response.equals("N")){
			Lab_122Inventory nre = new Lab_122Inventory(manufacturer, in);
			System.out.println(nre);
		}
	}
}
