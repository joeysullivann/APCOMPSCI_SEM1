public class Lab_14GMC implements Location{
	private int coordx, coordy;
	public Lab_14GMC(){
		coordx = 0;
		coordy = 0;		
	}
	public Lab_14GMC(int x, int y){
		coordx = x;
		coordy = y;
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