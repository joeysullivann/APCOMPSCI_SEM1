public class Lab_142Honda extends Lab_142CarClass{
	private double coordx, coordy;
	public Lab_142Honda(){
		coordx = 0;
		coordy = 0;		
	}
	public Lab_142Honda(double[] inpcoor){
		super();
		coordx = inpcoor[0];
		coordy = inpcoor[1];
		move(coordx, coordy);
	}
}
