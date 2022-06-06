package v3;

public class RandomNextHand implements NextHand{

	@Override
	public int decideHand() {
		int hand=new java.util.Random().nextInt(3);
		return hand;
		// 0:グー　1:チョキ　2:パー
	}
	

}
