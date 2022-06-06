package v4;

public class MainJanken {

	public static void main(String[] args) {
		Com com1=new Com(new RandomNextHand());
		com1.setName("Opponent1");
		
		User user=new User(new InputNextHand());
		user.setName("もう一人のボク");
		
		com1.setHand();
		user.setHand();
		GameManager g1=new GameManager();
		g1.judge(com1, user);
		
	}
	

}
