package world;

public class Hero {
	public String name="ミナト";
	public int hp=100;
	
	public Hero() {
		System.out.println("ヒーローのコンストラクタが動作");
	}
	public Hero(String n) {
		this();
		this.name=n;
	}
	
	public void attack(Matango m) {
		System.out.println(this.name+"は攻撃を仕掛けた！");
		m.hp-=6;
		System.out.println("5ポイントのダメージを与えた！");
	}
	public void run() {
		System.out.println(this.name+"は、逃げ出した！");
//		System.out.println("GAMEOVER");
//		System.out.println("最終HPは"+this.hp+"でした。");
	}
}
