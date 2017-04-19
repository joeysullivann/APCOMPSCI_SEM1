import java.util.ArrayList;
import java.util.Arrays;
public class Lab_142Toyota extends Lab_142CarClass{	
	private String scoord;
	private double coordx;
	private double coordy;
	public Lab_142Toyota(){
		coordx = 0;
		coordy = 0;	
	}
	public Lab_142Toyota(String inp){
		super();
		ArrayList<String> coorz = new ArrayList<>(Arrays.asList(inp.split(", ")));
		coordx = Double.parseDouble(coorz.get(0));
		coordy = Double.parseDouble(coorz.get(1));
		move(coordx,coordy);
	}
}
