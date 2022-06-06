package world;

public class Hero {
	private String name="ミナト";
	private int hp=100;
	public Sword sword;
	
	public Hero() {
		System.out.println("ヒーローのコンストラクタが動作");
	}
	public Hero(String n) {
		this();
		this.name=n;
	}
	public Hero(String name,int hp) {
		this(name);
		this.setHp(hp);
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	
	public void attack(Matango m) {
		System.out.println(this.name+"は攻撃を仕掛けた！");
		m.hp-=6;
		System.out.println("5ポイントのダメージを与えた！");
		this.hp-=2;
		System.out.println("お化けキノコ"+m.suffix+"から2ポイントの反撃を受けた！");
		if(this.hp<=0) {
			this.die();
		}
	}
	public void run() {
		System.out.println(this.name+"は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした。");
	}
	public void sleep() {
		System.out.println(this.name+"は眠った！");
		System.out.println("HPが10ポイント回復した！");
		this.hp+=10;
	}
	private void die() {
		System.out.println(this.name+"は死んでしまった！");
		System.out.println("GAME OVER");
	}
}
