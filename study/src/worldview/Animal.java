package worldview;

public class Animal {
	public int hp=10;
	public int mp;
	public int agi;
	public int size;
	public String name;
//	String[] field=String [land,river,sea,sky,forest];
	public int app;
	public boolean life=true;
	
	public Animal(String n) {
		this.name=n;
		if(this.hp>0) {
			this.life=true;
		}else {
			this.life=false;
		}
	}
	public Animal() {
		this("ハマグチ");
	}
	
	public void eat() {
		if(this.hp>0) {
			this.hp+=10;
			this.app-=20;
			System.out.println(this.name+"は食べた。");
			System.out.println("HPが10上昇した。");
			System.out.println("食欲が20減った。");
		}else {
			System.out.println(this.name+"は死んでいる……");
		}
	}
	
	public void run() {
		if(this.hp>0) {
			this.hp-=10;
			System.out.println(this.name+"は走った。");
			System.out.println("HPを10消費した。"+this.hp);
		}else {
			System.out.println(this.name+"は死んでいる……");
		}
	}
	public void join() {
		System.out.println(this.name+"は仲間に加わった。");
	}
}
