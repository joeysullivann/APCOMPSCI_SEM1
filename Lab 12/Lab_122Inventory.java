import java.lang.Math;
public class Lab_122Inventory{
	private String m, n, c;
	private int p;
	private long UPC;
	public Lab_122Inventory(){
		m = "";
		n = "";
		c = "";
		UPC = 0;
		p = 0;
	}
	public Lab_122Inventory(String manufacturer, String name){
		m = manufacturer;
		n = name;
		c = "UNDEFINED";
		p = 0;
		UPC = Math.abs((long)(Math.random() * 10000000000L) + 1);
	}
	public Lab_122Inventory(String manufacturer, String name, String category, int price){
		m = manufacturer;
		n = name;
		c = category;
		p = price;
		UPC = Math.abs((long)(Math.random() * 10000000000L) + 1);
	}
	public String toString(){
		return "\nInventory Items..." +
							"\nItem Name: " + n +
							"\nManufacturer: " + m +
                            "\nCategory: " + c +
                            "\nUPC: " + UPC +
							"\nPrice: " + p;
	}
	public String getm(){
		return m;
	}
	public String getn(){
		return n;
	}
	public String getc(){
		return c;
	}
	public long getUPC(){
		return UPC;
	}
	public int getp(){
		return p;
	}
}

