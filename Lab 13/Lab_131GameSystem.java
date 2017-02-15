import java.lang.Math;
public abstract class Lab_131GameSystem
{
	private String platform;
	private int serialNo;
	public Lab_131GameSystem()
	{
		this.platform = "";
		this.serialNo = (int)(Math.random() * 10000000) + 1; 
	}
	public Lab_131GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 10000000) + 1; 
	}
	public void setPlatform(String p)
	{
		this.platform = p;
	}
	public void setSerialNo(int sn)
	{
		this.serialNo = sn;
	}
	public abstract String getPlatform();
	public int getSerialNo()
	{
		return serialNo;
	}
	public String toString()
	{
		return platform + "..." + serialNo;
	}
}
