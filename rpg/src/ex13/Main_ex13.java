package ex13;

import world.Hero;
import world.Wand;
import world.Wizard;

public class Main_ex13 {

	public static void main(String[] args) {
		Hero h=new Hero("ヌカヤマ");
		Wand st=new Wand();
		Wizard w=new Wizard(100,200);
		st.setWname("棒切れ");
		st.setWpower(25);
		w.setHp(100);
		w.setMp(200);
		w.setName("ナカヤマ");
		w.setWand(st);
		
		
		w.heal(h);

	}

}
