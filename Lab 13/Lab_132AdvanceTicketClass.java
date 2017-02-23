public class Lab_132AdvanceTicketClass extends Lab_132TicketSuperClass{
	private int daysLeft;
	public Lab_132AdvanceTicketClass(int dl){
		super();
		daysLeft = dl;
	}
	public double getPrice(){
		if (daysLeft >= 10){
			return 30.00;
		}
		else{
			return 40.00;
		}
	}
}