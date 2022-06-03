package ex10;

import world.Hero;
import world.PoisonMatango;
import world.SuperHero;

public class Ex10_3 {

	public static void main(String[] args) {
		PoisonMatango pm=new PoisonMatango('A');
		Hero h=new Hero("ヌカヤマ");
		h.setHp(100);
		SuperHero sh=new SuperHero("ナカヤマ");
		pm.attack(h);
		h.attack(pm);
		pm.attack(sh);
		sh.attack(pm);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(sh);
	}

}
