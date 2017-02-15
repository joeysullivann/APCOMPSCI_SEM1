public class Lab_131GameSystem2
{
	public static void main(String[]args)
	{
		Lab_131GameSystem objXBox = new Lab_131Xbox("XBox");
		Lab_131GameSystem objPS = new Lab_131PS("PlayStation");
		Lab_131GameSystem objPC = new Lab_131PC("PC");

		System.out.println(objXBox);
		System.out.println();
		System.out.println(objPS);
		System.out.println();
		System.out.println(objPC);
		System.out.println();
	}
}
