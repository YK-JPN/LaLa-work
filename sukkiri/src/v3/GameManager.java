package v3;

public class GameManager {
	public void judge(Com c,User u) {
		int cHand=c.getHand();
		int uHand=u.getHand();
		
		if(uHand==cHand) {
			c.setResult("draw");
			u.setResult("draw");
		}else if((uHand+1)%3==cHand) {
			c.setResult("lose");
			u.setResult("win");
		}else {
			c.setResult("win");
			u.setResult("lose");
		}
	}
	public void dispResult(Com c,User u) {
		System.out.println("ゲーム結果！！");
		System.out.println(c);
		System.out.println(u);
		System.out.println(convToJp(c));
	}
	public String convToJp(Com c) {
		if(c.getResult().equals("lose")) {
			return "あなたの勝ちです、おめでとうございます。";
		}else if(c.getResult().equals("win")) {
			return "あなたの負けです、残念でしたね。";
		}else {
			return "引き分けです。再戦しませんか？";
		}
	}
}
