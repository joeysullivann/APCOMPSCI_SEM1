public class Lab_142GMC extends Lab_142CarClass{
	private double coordx, coord;
	public Lab_142GMC(){
		super();
		coordx = 0;
		coordy = 0;		
	}
	public Lab_142GMC(double x, double y){
		super();
		coordx = x;
		coordy = y;
		move(coordx, coordy);
	}
}
