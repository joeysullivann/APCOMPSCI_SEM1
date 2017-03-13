public class Lab_14Toyota implements Location
{	
	private double[] location;
	public Lab_14Toyota()
	{
		location = new double[2];
	}
	public Lab_14Toyota(String js){
		location = new double[2];
		String[] sep = js.split(", ");
		location[0] = Double.parseDouble(sep[0]);
		location[1] = Double.parseDouble(sep[1]);
	}
	public double[] getLoc(){
		return location;
	}
	public int getID(){
		return (int)(Math.random() * 999999) + 1;
	}
}
