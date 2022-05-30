package world;

public class Hero {
	public String name="ミナト";
	public int hp=100;
	
	public void attack(Matango m) {
		System.out.println(this.name+"は攻撃を仕掛けた！");
		m.hp-=6;
		System.out.println("5ポイントのダメージを与えた！");
	}
	public void sleep() {
		this.hp=100;
		System.out.println(this.name+"は、眠って回復した！");
	}
	public void sit(int sec) {
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した！");
	}
	public void slip() {
		this.hp-=5;
		System.out.println(this.name+"は、転んだ！");
		System.out.println("5のダメージ！");		
	}
	public void run() {
		System.out.println(this.name+"は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした。");
	}
}
