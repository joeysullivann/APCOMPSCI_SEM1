import java.util.ArrayList;
import java.util.Arrays;
public class Lab_10KeepComposites{	
	public static void main(String[]args){
		Integer [] number = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(number));
		int numbersSize = numbers.size();
		System.out.println(removePrimes(numbers));
	}
	public static int gFactor(int n){
		for (int j = 2; j < n; j++){
			if ((n % j) == 0){
				return 1;
			}
		}
		return 0;
	}
	public static ArrayList<Integer> removePrimes(ArrayList<Integer> num){
		for (int j = 0; j < num.size(); j++){
			if (gFactor(num.get(j)) == 0){
				num.remove(j);
				j = j - 1;
			}
		}
		return num;
	}
}