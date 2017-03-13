public class Lab_14Honda implements Location{
	private double coordx, coordy;
	public Lab_14Honda(){
		coordx = 0;
		coordy = 0;		
	}
	public Lab_14Honda(double[] inpcoor){
		coordx = inpcoor[0];
		coordy = inpcoor[1];
	}
	public double[] getLoc(){
		double Location[] = new double[2];
		Location[0] = coordx;
		Location[1] = coordy;
		return Location;
	}
	public int getID(){
		return (int)(Math.random() * 999999) + 1;
	}
}
