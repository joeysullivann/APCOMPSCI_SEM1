public class Lab_121Human{
	private String h, e, s;
	public Lab_121Human(){
		h = "";
		e = "";
		s = "";
	}
	public Lab_121Human(String hair, String eye, String skin){
		h = hair;
		e = eye;
		s = skin;
	}
	public void setAttributes(String hair, String eye, String skin){
		h = hair;
		e = eye;
		s = skin;
	}
	public String geth(){
		return h;
	}
	public String gete()
	{
		return e;
	}
	public String gets()
	{
		return s;
	}
}
