package chap08;

import old_until20220530.Hero_ed;
import world.Matango;

public class Main307 {

	public static void main(String[] args) {
		//勇者よ、この仮想世界に生まれよ！
		
		Hero_ed h=new Hero_ed("ミナト", 150);
		System.out.println("勇者"+h.name+"を生み出しました！");
		
		Matango m1=new Matango();
		m1.hp=50;
		m1.suffix='A';
		
		Matango m2=new Matango();
		m2.hp=48;
		m2.suffix='A';
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
		//お化けキノコよ、この仮想世界に生まれよ！
		//勇者よ、戦え！
		//お化けキノコよ、逃げろ！
	}

}
