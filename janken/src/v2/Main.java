package v2;

public class Main {

	public static void main(String[] args) {
		// 戦略クラスを選ぶ
		NextHand nextHand = new CleverNextHand();
		Player com = new Player(nextHand);
		System.out.println("comの次の手は " + com.getHand() + "です。");
		
		NextHand next2Hand = new RandomNextHand();
		Player com2 = new Player(nextHand);
		System.out.println("com2の次の手は " + com.getHand() + "です。");
	}

}
