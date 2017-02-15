public abstract class Lab_131GameConsole extends Lab_131GameSystem
{
	public Lab_131GameConsole()
	{
		super();
	}
	public Lab_131GameConsole(String n)
	{
		super(n);
	}

	public abstract String getController();

	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nController: " + getController();
	}
}