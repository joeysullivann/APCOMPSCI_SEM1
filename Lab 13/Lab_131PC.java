public class Lab_131PC extends Lab_131GameSystem
{
	public Lab_131PC()
	{
		super();
	}
	public Lab_131PC(String n)
	{
		super(n);
	}
	public String SystemInput()
	{
		return "Keyboard and Mouse";
	}
	public String getPlatform()
	{
		return "PC";
	}

	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + super.getSerialNo() + "\nSystem Input: " + SystemInput();
	}
}


