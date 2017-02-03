import java.util.Scanner;
public class Lab_111Gun{
	static int bulletamount = 96;
	static int clip = 16;
	static int shots = 0;
	static String [] clips = new String [16];
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Reload!");
		resetclip();
		while (bulletamount > 0 || shots > 0){
			System.out.println("Action: ");
			String action = js.nextLine();
			if (action.equals("R")){
				reload();
			}
			if (action.equals("S")){
				System.out.println(shoot());
			}
			printClip();
		}
		System.out.println("Out of Bullets!!!");
	}
	public static void resetclip(){
		for (int j = 0; j < clips.length; j++){
			clips[j] = "[]";
		}
	}
	public static String shoot(){
		if (shots > 0){
			clips[shots-1] = "[]";
			shots -= 1;
			System.out.println("\nBoom!");
		}
		else{
			System.out.println("\nReload!");
		}
		return "";
	}
	public static void reload(){
		if (bulletamount >= clip){
			bulletamount -= clip;
			shots = clip;
		}
		else{
			shots = bulletamount;
			bulletamount = 0;
		}
		resetclip();
		for (int j = 0; j < shots; j++){
			clips[j] = " * ";
		}

	}
	public static void printClip(){
		String output = "";
		output = "Bullets: \t" + bulletamount + "\nClip:\t";
		for (int j = 0; j < clip; j++)
		{
			output += clips[j];
		}
		System.out.println(output);
	}
}



