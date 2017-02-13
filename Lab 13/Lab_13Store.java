import java.util.*;
public class Lab_13Store{
	ArrayList<Lab_13Toy> toyList = new ArrayList<Lab_13Toy>();
	public Lab_13Store(){
		toyList = new ArrayList<Lab_13Toy>();	
	}
	public Lab_13Store(String t){
		loadToys(t);
	}
	public  void loadToys(String ts){
		toyList = new ArrayList<Lab_13Toy>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i += 2){
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Lab_13Toy t = getThatToy(name);
			if (t == null){
				if (type.equals("Car")) {
					toyList.add(new Lab_13Car(name));
				}
				if (type.equals("AF")){
					toyList.add(new Lab_13Toys(name));
				}
			}
			else{
				t.setCount(t.getCount() + 1);
				}
			
		}
	}
		public  Lab_13Toy getThatToy(String nm)
	{
		for (Lab_13Toy x : toyList)
		{
			if (x.getName().equals(nm))
			{
				return x;
			}
		}
		return null;
	}

	public  String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Lab_13Toy x: toyList)
		{
			if (max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		
		}
		return name;
	}
	public  String getMostFrequentType(){
		int cars = 0;
		int figures = 0;
		for(Lab_13Toy x: toyList){
			if (x.getType().equals("Car")){
				cars = cars + 1;
			}	
			if (x.getType().equals("AF")){
				figures = figures +1;
			}
		}
		if (cars > figures){
			return "Cars";
		}
		if (figures > cars){
			return "Action Figures";
		}
		else{
			return "Equal Amounts of Action Figures and Cars!";
		}
	}

	public String toString()
	{
		return ""  + toyList;
	}
}

