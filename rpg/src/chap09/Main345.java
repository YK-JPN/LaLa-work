package chap09;

import world.Hero;
import world.Wizard;

public class Main345 {

	public static void main(String[] args) throws Exception {
		Hero h1=new Hero("ミナト",150);
		Hero h2=new Hero("アサカ",100);
		Wizard w=new Wizard();
		w.name="スガワラ";
		w.hp=50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

	}

}
