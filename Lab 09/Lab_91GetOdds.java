import java.util.Scanner;
public class Lab_91GetOdds{
	static String list = "";
	public static void main(String[]args){
		int [] numbers = new int[10];
		fillArray(numbers);
		System.out.println("For the following numbers " + printArray(numbers));
		System.out.println(getOdds(numbers) + "are all the odd numbers.");
	}
	public static void fillArray(int[] num){
		for (int j = 0; j < num.length; j++){
			num[j] = (int)((Math.random()*101));
		}
	}
	public static String printArray(int[] dig){
		for (int n: dig){
			list += n + " " ;
		} 
		return list;
	}
	public static String getOdds(int[] nb){
		String odds = "";
		for (int numb: nb){
			if ((numb % 2) == 0){
				odds += "";
			}
			else{
				odds += numb + " ";
			}
		}
		return odds;
	}
}