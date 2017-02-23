public class Lab_132Student extends Lab_132AdvanceTicketClass{
	public Lab_132Student(int dl){
		super(dl);
	}
	public double getPrice(){
		return super.getPrice()/2;
	}
	public String toString(){
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + "\nSTUDENT ID REQUIRED";
	}
}
