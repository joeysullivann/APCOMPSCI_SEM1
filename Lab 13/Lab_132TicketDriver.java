public class Lab_132TicketDriver{
	public static void main(String[]args){
		Lab_132TicketSuperClass objAdvancedDiscount = new Lab_132AdvanceTicketClass(15);
		Lab_132TicketSuperClass objAdvancedNoDiscount = new Lab_132AdvanceTicketClass(5);
		Lab_132TicketSuperClass objStudentAdvanced = new Lab_132Student(15);
		Lab_132TicketSuperClass objWalkup = new Lab_132Walkup();
		System.out.println("Advance Ticket w/ Discount (15 days before)");
		System.out.println(objAdvancedDiscount);
		System.out.println();
		System.out.println("Advance Ticket w/o Discount (5 days before)");
		System.out.println(objAdvancedNoDiscount); 
		System.out.println();
		System.out.println("Student Advance Ticket w/ Discount");
		System.out.println(objStudentAdvanced);
		System.out.println();
		System.out.println("Walkup Ticket");
		System.out.println(objWalkup);

	}
}
