public class Lab_141Honda extends Lab_141CarClass{
	private double coordx, coordy;
	public Lab_141Honda(){
		coordx = 0;
		coordy = 0;		
	}
	public Lab_141Honda(double[] inpcoord){
		super();
		coordx = inpcoord[0];
		coordy = inpcoord[1];
	}
	public void move(double x, double y){
		coordx += x;
		coordy += y;
	}
	public double[] getLoc(){
		double location2[] = new double[2];
		location2[0] = coordx;
		location2[1] = coordy;
		return location2;
	}
	public int getID(){
		return ID;
	}
}


