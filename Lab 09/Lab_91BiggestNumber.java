public class Lab_91BiggestNumber{
	static String Array = "";
	public static void main(String[]args){
		int [] numbera = new int[10];
		fillArray(numbera);
		System.out.println("For the following numbers... " + printArray(numbera));
		System.out.println("The biggest number is... " + getBiggest(numbera));
	}
	public static void fillArray(int[] nums){
		for (int j = 0; j < numberz.length; j++){
			numberz[j] = (int)((Math.random()*101));
		}
	}
	public static String printArray(int[] num){
		for (int numbe: num){
			Array += numbe + " ";
		} 
		return Array;
	}
	public static int getBiggest(int[] digits){
		int max = 0;
		for (int numb: digits){
			if (numb > max){
				max = numb;
			}
			else{
				max = max;
			}
		}
		return max;
	}
}
