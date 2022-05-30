package world;

public class Thief {
	public String name;
	public int hp;
	public int mp;
	
	public Thief(String n,int h,int m) {
		this.name=n;
		this.hp=h;
		this.mp=m;
	}
	public Thief(String n,int h) {
		this(n,h,5);
	}
	public Thief(String n) {
//		this(n,40,5);これより短い記述方法がある
		this(n,40);
	}
	
}
