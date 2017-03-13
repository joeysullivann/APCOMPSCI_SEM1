import java.util.ArrayList;
import java.util.Arrays;
public class Lab_141Toyota extends Lab_141CarClass{	
	private String js;
	private double coordx;
	private double coordy;
	public Lab_141Toyota(){	
	}
	public Lab_141Toyota(String js){
		super();
		ArrayList<String> coorz = new ArrayList<>(Arrays.asList(js.split(", ")));
		double x = Double.parseDouble(coorz.get(0));
		double y = Double.parseDouble(coorz.get(1));
		move(x,y);
	}
	public void move(double x, double y){
		coordx += x;
		coordy += y;
	}
	public double[] getLoc(){
		double[] location2 = {coordx, coordy};
		return location2;
	}
	public int getID(){
		return ID;
	}
}
