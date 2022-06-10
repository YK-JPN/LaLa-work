package v3;

public class GameManager {
	private String msg;

	public void judge(Com c, User u) {
		int cHand = c.getHand();
		int uHand = u.getHand();
		// ↓convToJpの代わり、ただし場所はここじゃないので後で変える(変えた)
//		String msg=null;

		if (uHand == cHand) {
			c.setResult("draw");
			u.setResult("draw");
			msg = "引き分けです。";
		} else if ((uHand + 1) % 3 == cHand) {
			c.setResult("lose");
			u.setResult("win");
			msg = u.getName() + "の勝ちです。";
		} else {
			c.setResult("win");
			u.setResult("lose");
			msg = u.getName() + "の負けです。";
		}
	}

	public void dispResult(Com c, User u) {
		System.out.println("ゲーム結果！！");
		System.out.println(c.getName() + ":" + Const.hands[c.getHand()]);
		System.out.println(u.getName() + ":" + Const.hands[u.getHand()]);
//		System.out.println(convToJp(c));
		System.out.println(msg);
	}

//	public String convToJp(Com c) {
//		if(c.getResult().equals("lose")) {
//			return "あなたの勝ちです、おめでとうございます。";
//		}else if(c.getResult().equals("win")) {
//			return "あなたの負けです、残念でしたね。";
//		}else {
//			return "引き分けです。再戦しませんか？";
//		}
//	}
	public boolean isContinue() {
		System.out.print("もう一度やりますか？ (y/n) >");
		// 入力した文字を小文字に変換して"Y"の場合も網羅する
		String yesno = new java.util.Scanner(System.in).nextLine().toLowerCase();
		if (yesno.equals("y")) {
			return true;
		}
			return false;
		
	};
}
