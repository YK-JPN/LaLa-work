package ex13;

import world.Hero;
import world.Matango;
import world.Wand;
import world.Wizard;

public class Main_teacher {

	public static void main(String[] args) {
		Wand tue=new Wand();
		tue.setWname("Jacob");
		tue.setWpower(100);
		Wizard w=new Wizard(tue);
		w.setName("ヌカヤマ");
		Hero h=new Hero("ナカヤマ");
		w.heal(h);
		Wizard w2=new Wizard("きんに君",100000,200,tue);
		Matango m=new Matango();
		w2.fireball(m);
		
	}

}
