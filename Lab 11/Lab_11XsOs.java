public class Lab_11XsOs{
	public static void main(String[]args){
		String [][] js = new String [4][4];
		for (int j = 0; j < js.length; j ++){
			for (int s = 0; s < js[j].length; s++){
				int p = 1 + (int)((Math.random()*2));
				if (p == 1){
					js[j][s] = "x";
				}
				if (p == 2){
					js[j][s] = "o";
				}
				System.out.print(js[j][s] + "\t");
			}
			System.out.println("");
		}
	}
}
