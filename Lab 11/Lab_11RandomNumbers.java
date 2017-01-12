public class Lab_11RandomNumbers{
	public static void main(String[]args){
		int [][] numbers = new int [4][4];
		for (int j = 0; j < numbers.length; j++){
			for (int s = 0; s < numbers[j].length; s++){
				numbers[j][s] = (int)((Math.random()*101));
			}
		}
		for (int j = 0; j < numbers.length; j++){
			for (int s = 0; s < numbers[j].length; s++){
				System.out.print(numbers[j][s] + "\t");
			}
			System.out.println("");
		}
	}
}
