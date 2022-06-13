package chap17.train;

import java.util.InputMismatchException;

public class Tool {
	public int inputNum() {
		boolean isNum = false;
		int num = -1;
		do {
			System.out.print("数字を入力して下さい。(inputNum) > ");
			String numTxt = new java.util.Scanner(System.in).nextLine();
			try {
				num = Integer.parseInt(numTxt);
				isNum = true;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("数字じゃないと困るんですよね……");
			}
		} while (!isNum);
		return num;

	}

	public int getNum() {
		boolean isgn = false;
		int n = 0;
		do {
			System.out.print("数字を入力して下さい。(getNum) > ");
			
			try {
				n = new java.util.Scanner(System.in).nextInt();
				isgn = true;
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("数字を入力して下さいよ……");
			}
		} while (!isgn);
		return n;
	}
}
