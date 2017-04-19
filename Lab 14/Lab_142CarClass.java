public abstract class Lab_142CarClass implements Lab_142Location{
	int ID;
	double coordx, coordy;
	double[] location;
	public Lab_142CarClass(){
		ID = (int)(Math.random() * 999999) + 1;
	}
	public void move(double x, double y){
		coordx += x;
		coordy += y;
	}
	public int getID(){
		return ID;
	}
	public double[] getLoc(){
		double location[] = new double[2];
		location[0] = coordx;
		location[1] = coordy;
		return location;
	}
}
