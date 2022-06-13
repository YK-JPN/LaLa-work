package ex17;

public class Main17_3 {

	public static void main(String[] args) {
		boolean isn = false;
		int i = 0;
		do {
			System.out.print("Input Number, please. >>");
			String s = new java.util.Scanner(System.in).nextLine();
			try {
				i = Integer.parseInt(s);
				isn = true;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Retry!!");
			}
		} while (!isn);
		System.out.println("Your Input -> "+i);
	}

}
// 		nextIntで数値を受け取ろうとすると、最後のEnterを改行文字として
//		受け取ってしまうので直後にScanner.nextLine()(この文字列は受け取らない)を
//		差し込むといった工夫が必要となる。
