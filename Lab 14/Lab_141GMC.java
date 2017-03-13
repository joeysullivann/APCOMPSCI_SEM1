public class Lab_141GMC extends Lab_141CarClass
{
	private double coordx, coordy;
	public Lab_141GMC(){
		super();
		coordx = 0;
		coordy = 0;		
	}
	public Lab_141GMC(double x, double y)
	{
		super();
		coordx = x;
		coordy = y;
	}
	public void move(double x, double y)
	{
		coordx += x;
		coordy += y;
	}
	public double[] getLoc()
	{
		double location2[] = new double[2];
		location2[0] = coordx;
		location2[1] = coordy;
		return location2;
	}
	public int getID()
	{
		return ID;
	}
}

