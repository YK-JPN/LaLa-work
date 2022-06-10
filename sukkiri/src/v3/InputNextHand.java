package v3;

import java.util.Scanner;

public class InputNextHand implements NextHand{

	@SuppressWarnings("resource")
	@Override
	public int decideHand() {
		System.out.println("0～2の数字を入力して手を選択して下さい。");
		System.out.println("0:グー　1:チョキ　2:パー");
		System.out.print(">");
		int hand=new Scanner(System.in).nextInt();
		return hand;
	}
	// SuppresWarningsがないとEclipse上にエラー表示が出る(プログラム自体に影響はない)。

}
