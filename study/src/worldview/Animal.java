package worldview;

public class Animal {
	private int hp=10;
	private int mp;
	private int agi;
	private int size;
	private String name;
//	String[] field=String [land,river,sea,sky,forest];
	public int app;
	private boolean life=true;
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getAgi() {
		return agi;
	}
	public void setAgi(int agi) {
		this.agi = agi;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isLife() {
		return life;
	}
	public void setLife(boolean life) {
		this.life = life;
	}
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
