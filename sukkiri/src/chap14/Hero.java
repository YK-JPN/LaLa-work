package chap14;

public class Hero {
	public String name;
	public int hp;
	public static int money;
	
	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
		//小数点以下切り捨てなので上記だと0-999になる。
	}
	
	
	
	
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}
