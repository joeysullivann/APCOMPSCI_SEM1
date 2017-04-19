public abstract class Car implements Location
{
	int ID;
	double coorx, coory;
	double[] location;

	public Car()
	{
		ID = (int)(Math.random() * 999999) + 1;
	}

	public void move(double x, double y)
	{
		coorx += x;
		coory += y;
	}

	public int getID()
	{
		return ID;
	}

	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = coorx;
		location[1] = coory;
		return location;
	}
}
