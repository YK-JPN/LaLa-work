package world;

public class Matango {
	public int hp=50;
	public final int LEVEL=10;
	public char suffix;
	public String type;
	
	public Matango(char suffix) {
		this.suffix=suffix;
		this.type="お化け";
	}
	public Matango() {
		this('S');
	}
	public void attack(Hero h) {
		if(h.getHp()<=0) {
			System.out.println(h.getName()+"は死んでいる……");
		}else {
		h.setHp(h.getHp()-10);
		System.out.println(this.type+"キノコ"+this.suffix+"の攻撃！!");
		System.out.println(h.getName()+"に10のダメージ!");
		if(h.getHp()<=0) {
			System.out.println(h.getName()+"は死んでしまった……");
		}else {
			System.out.println(h.getName()+"の残りHP:"+h.getHp());
		}
		}
	}
	
	public void run() {
		System.out.println(this.type+"キノコ"+this.suffix+"は逃げ出した！");
	}
}
