package world;

public class Wizard {
	public String name;
	public int hp;
	public void heal(Hero h) throws Exception {
		h.hp+=10;
		System.out.println(this.name+"は「ヒール」を唱えた！");
		Thread.sleep(2000);
		System.out.println(h.name+"のHPを10回復した！");
		System.out.println(h.name+"のHPは"+h.hp+"になった！");
		Thread.sleep(1000);
	}
}
