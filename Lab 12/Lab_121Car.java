public class Lab_121Car{
	private String p, i, e, t;
	public Lab_121Car(){
		p = "";
		i = "";
		e ="";
		t= "";
	}
	public Lab_121Car(String paint, String interior, String engine, String tires){
		p = paint;
		i = interior;
		e = engine;
		t = tires;
	}
	public void setCustom(String paint, String interior, String engine, String tires){
		p = paint;
		i = interior;
		e = engine;
		t = tires;		
	}
	public String getp(){
		return p;
	}
	public String geti(){
		return i;
	}
	public String gete(){
		return e;
	}
	public String gett(){
		return t;
	}
}
