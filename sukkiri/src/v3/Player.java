package v3;

public abstract class Player {
	private int hand;
	private String name;
	private String result;
//	private String[] result= {"draw.","win!","lose"};
	// 次の手を決める戦略型(インターフェースで指定)
	private NextHand nextHand=new InputNextHand();
	
	public Player(NextHand neh) {
		this.nextHand=neh;
	}
	
	// デバッグ用に用意
	public String toString() {
		return this.name+":"+this.hand+":"+this.result;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

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
		this.hand =this.nextHand.decideHand();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
