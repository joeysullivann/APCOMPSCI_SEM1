import java.lang.Math.*;
public class Lab_12Distance{
	private int xOne, yOne, xTwo, yTwo;
	private double d;
	public Lab_12Distance(){
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		d = 0;
	}
	public Lab_12Distance(int x1, int y1, int x2, int y2){
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		d = 0;
	}
	public void setCoordinates(int x1, int y1, int x2, int y2){
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}
	public int getX1(){
		return xOne;
	}
	public int getY1(){
		return yOne;
	}
	public int getX2(){
		return xTwo;
	}
	public int getY2(){
		return yTwo;
	}
	public double getd(){
		return Math.sqrt((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne));
	}
}
