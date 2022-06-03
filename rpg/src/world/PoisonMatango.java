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
		if(h.getHp()<=0) {
			System.out.println(h.getName()+"は死んでいる……");
		}else{
				System.out.println("更に毒の胞子をバラ撒いた！！");
//			int damage=(int)(Math.floor(h.getHp()/5));
//			h.setHp(h.getHp()-damage);
			int damage=h.getHp()/2;
			h.setHp(h.getHp()-damage);
			System.out.println(h.getName()+"に"+damage+"ポイントのダメージ！");
			this.poisonAtTimes-=1;
			System.out.println("毒攻撃残り:"+this.poisonAtTimes);
			}
		}
	}
}
