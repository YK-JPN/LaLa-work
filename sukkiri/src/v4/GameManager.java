package v4;

public class GameManager {
	public void judge(Com c,User u) {
		int cHand=c.getHand();
		int uHand=u.getHand();
		int jn=(uHand-cHand+3)%3;//jn judge number
		
		
		System.out.println(u.getName()+"の手は"+u.getHandJp(u.getHand()));
		System.out.println(c.getName()+"の手は"+c.getHandJp(c.getHand()));
		System.out.print(u.getName()+" , you "+u.getResult(jn));
		
//		if(jn==0) {
//			c.setResult("draw");
//			u.setResult("draw");
//		}else if((jn==1) {
//			c.setResult("lose");
//			u.setResult("win");
//		}else {
//			c.setResult("win");
//			u.setResult("lose");
//		}
	}
//	public void dispResult(Com c,User u) {
//		System.out.println("ゲーム結果！！");
//		System.out.println(c);
//		System.out.println(u);
//		System.out.println(convToJp(c));
//	}
//	public String convToJp(Com c) {
//		if(c.getResult().equals("lose")) {
//			return "あなたの勝ちです、おめでとうございます。";
//		}else if(c.getResult().equals("win")) {
//			return "あなたの負けです、残念でしたね。";
//		}else {
//			return "引き分けです。再戦しませんか？";
//		}
//	}
}
