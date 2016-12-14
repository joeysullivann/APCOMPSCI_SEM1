import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lab_10ExpressionSolver{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your equation:");
		String expression = js.nextLine();
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		int j = 0;
		while (j < equation.size()){
			if ((equation.get(j).equals("*")) || (equation.get(j).equals("/"))){
				if (equation.get(j).equals("*")){
					equation.set(j, "" + (Integer.parseInt(equation.get(j-1)) * Integer.parseInt(equation.get(j+1)) ) );
				}
				if (equation.get(j).equals("/")){
					equation.set(j, "" + (Integer.parseInt(equation.get(j-1)) / Integer.parseInt(equation.get(j+1)) ) );
				}
				equation.remove(j-1);
				equation.remove(j);
			}
			else{
			j++;	
			}
		}
		j = 0;
		while(j < equation.size()){
			if ((equation.get(j).equals("+")) || (equation.get(j).equals("-"))){
				if (equation.get(j).equals("+")){
					equation.set(j, "" + (Integer.parseInt(equation.get(j-1)) + Integer.parseInt(equation.get(j+1)) ) );
				}
				if (equation.get(j).equals("-")){
					equation.set(j, "" + (Integer.parseInt(equation.get(j-1)) - Integer.parseInt(equation.get(j+1)) ) );
				}
				equation.remove(j-1);
				equation.remove(j);
			}
			else
			{
			j++;	
			}
		}
		System.out.println(equation);
	}
}
