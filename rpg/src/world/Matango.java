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
	public void attack(Hero h) {
		if(h.hp<=0) {
			System.out.println(h.name+"は死んでいる……");
		}else {
		h.hp-=10;
		System.out.println(this.type+"キノコ"+this.suffix+"の攻撃！!");
		System.out.println(h.name+"に10のダメージ!");
		if(h.hp<=0) {
			System.out.println(h.name+"は死んでしまった……");
		}else {
			System.out.println(h.name+"の残りHP:"+h.hp);
		}
		}
	}
	
	public void run() {
		System.out.println(this.type+"キノコ"+this.suffix+"は逃げ出した！");
	}
}
