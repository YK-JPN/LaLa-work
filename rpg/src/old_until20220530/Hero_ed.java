package old_until20220530;

public class Hero_ed {
	public String name;
	public int hp;
//	public Sword sword;
	
	public Hero_ed(String name,int hp) {
		this.name=name;
		this.hp=hp;
		
	}
	public Hero_ed() {
		this("ダミー",100);
	}
	
	public void attack() {
//		System.out.println(this.name+"は"+this.sword.name+"で攻撃した！");
//		System.out.println("敵に"+this.sword.damage+"ポイントのダメージを与えた！");
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
