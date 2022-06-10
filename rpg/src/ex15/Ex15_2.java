package ex15;

public class Ex15_2 {

	public static void main(String[] args) {
//		String folder=new java.util.Scanner(System.in).nextLine();
//		String folder="c:\\javadev";
		String folder="c:\\javadev\\";
		String file="readme.txt";
		if(!(folder.endsWith("\\"))) {
			folder=folder+"\\";
		}
		String filename=folder+file;
		System.out.println("Filename ->"+filename);
	}

}
