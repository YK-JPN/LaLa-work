package v4;

public abstract class Player {
	private int hand;
	private String name;
//	private String result;
	private String[] result= {"draw.","lose…","win!"};
	private String[] handJp= {"グー","チョキ","パー"};
	// 次の手を決める戦略型(インターフェースで指定)
	private NextHand nextHand=new InputNextHand();
	
	public Player(NextHand neh) {
		this.nextHand=neh;
	}
	
	public String toString() {
		return this.name+":"+this.hand+":"+this.result;
	}

	public String getResult(int jn) {
		return this.result[jn];
	}

//	public void setResult(int jn) {
//		this.result = result;
//	}

	public NextHand getNextHand() {
		return nextHand;
	}

	public void setNextHand(NextHand nextHand) {
		this.nextHand = nextHand;
	}

	public int getHand() {
		return hand;
	}

	public void setHand() {
		this.hand =nextHand.decideHand();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHandJp(int n) {
		return handJp[n];
	}


	
}
