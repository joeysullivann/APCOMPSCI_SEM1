import java.lang.Math;
public class Lab_122UserClass{
	private String fn, ln, a;
	private int ud;
	public Lab_122UserClass(){
		fn = "";
		ln = "";
		a = "";
		ud = 0;
	}
	public Lab_122UserClass(String first, String last){
		fn = first;
		ln = last;
		a = "undefined";
		ud = (int)(Math.random() * 1000000) + 1; 
	}
	public Lab_122UserClass(String first, String last, String avatar){
		fn = first;
		ln = last;
		a = avatar;
		ud = (int)(Math.random() * 1000000) + 1;
	}
	public void seta(String avatar){
		a = avatar;
	}
	public String toString(){
		return "Customer Info...\nFirst Name: " + fn +
                           "\nLast Name: " + ln +
                           "\nAvatar : " + a +
                           "\nUser ID# : " + ud;
	}
	public String getfn(){
		return fn;
	}
	public String getln(){
		return ln;
	}
	public String geta(){
		return a;
	}
	public int getud(){
		return ud;
	}
}
