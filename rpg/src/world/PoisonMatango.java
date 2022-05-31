package world;

public class PoisonMatango extends Matango{
	public int poisonAtTimes=5;
	public PoisonMatango(char suffix) {
		super(suffix);
		this.type="お化け毒";
	}
	public void attack(Hero h) {
		super.attack(h);
		if(this.poisonAtTimes>0) {
		if(h.hp<=0) {
			System.out.println(h.name+"は死んでいる……");
		}else{
				System.out.println("更に毒の胞子をバラ撒いた！！");
//			int damage=(int)(Math.floor(h.hp/5));
//			h.hp=h.hp-damage;
			int damage=h.hp/2;
			h.hp-=damage;
			System.out.println(h.name+"に"+damage+"ポイントのダメージ！");
			this.poisonAtTimes-=1;
			System.out.println("毒攻撃残り:"+this.poisonAtTimes);
			}
		}
	}
}
