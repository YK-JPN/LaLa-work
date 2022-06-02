package chap11;

import world.Deathbat;
import world.Goblin;
import world.SuperHero;
import world.Werewolf;

public class Main433 {

	public static void main(String[] args) {
		Goblin g1=new Goblin();
		g1.hp=100;
		g1.mp=10;
		g1.attack();
		g1.run();
		System.out.println("hp:"+g1.hp);
		System.out.println("mp:"+g1.mp);
		
		Werewolf w1=new Werewolf();
		w1.hp=200;
		w1.mp=50;
		w1.attack();
		w1.run();
		System.out.println("hp:"+w1.hp);
		System.out.println("mp:"+w1.mp);
		
		Deathbat d1=new Deathbat();
		d1.hp=30;
		d1.mp=400;
		d1.attack();
		d1.run();
		System.out.println("hp:"+d1.hp);
		System.out.println("mp:"+d1.mp);
		
		SuperHero sh=new SuperHero("ヌカヤマ");
		sh.sleep();
	}

}
