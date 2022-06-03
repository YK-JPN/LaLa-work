package world;

public class Wizard extends Character{
	public int mp=260;
	public void heal(Hero h) throws Exception {
		h.setHp(h.getHp()+10);
		System.out.println(this.name+"は「ヒール」を唱えた！");
		Thread.sleep(2000);
		System.out.println(h.getName()+"のHPを10回復した！");
		System.out.println(h.getName()+"のHPは"+h.getHp()+"になった！");
		Thread.sleep(1000);
	}
	@Override
	public void attack(Matango m) {
		this.mp-=10;
		m.hp-=30;
		System.out.println(this.name+"の攻撃！");
		System.out.println("敵に30のダメージ！");
		
	}
	@Override
	public void sleep() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public void fireball(Matango m) {
		m.hp-=50;
		this.mp-=30;
		System.out.println(this.name+"は火の玉を放った！！");
		System.out.println("敵に50ポイントのダメージ！");
	}
}
