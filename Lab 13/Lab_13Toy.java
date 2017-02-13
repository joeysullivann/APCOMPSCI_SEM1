public abstract class Lab_13Toy{
	private String name;
	private int count;
	public Lab_13Toy(){
		this.name = "";
		this.count = 1;
	}
	public Lab_13Toy(String n){
		this.name = n;
		this.count = 1;
	}
	public void setName(String n){
		this.name = n;
	}
	public void setCount(int c){
		this.count = c;
	}
	public String getName(){
		return name;
	}
	public int getCount(){
		return count;
	}
	public abstract String getType();
	public String toString(){
		return name + "\t...\t" + count;
	}
}
