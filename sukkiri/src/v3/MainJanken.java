package v3;

public class MainJanken {

	public static void main(String[] args) {
		Com com1 = new Com(new RandomNextHand());
		com1.setName("Opponent1");

		User user = new User(new InputNextHand());
		user.setName("もう一人のボク");

		GameManager g1=new GameManager();
		do {
			com1.setHand();
			user.setHand();
//			g1 = new GameManager();
			g1.judge(com1, user);
			g1.dispResult(com1, user);
		} while (g1.isContinue());
		System.out.println("Bye!!");
	}

}
