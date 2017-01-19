import java.lang.Math.*;
public class Lab_12MPH{
	private int d, h, m;
	private double mph;
	public Lab_12MPH(){
		d = 0;
		h = 0;
		m= 0;
		mph = 0;
	}
	public Lab_12MPH(int di, int ho, int mi){
		d = di;
		h = ho;
		m = mi;
		mph = 0;
	}
	public void setValues(int distance, int hours, int minutes){
		d = distance;
		h = hours;
		m = minutes;
	}
	public int getd(){
		return d;
	}
	public int geth(){
		return h;
	}
	public int getm(){
		return m;
	}

	public double getmph(){
		return (d/(h+ (m / 60.0)));
	}
} 
