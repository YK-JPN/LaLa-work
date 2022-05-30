package chap09;

import world.Hero;
import world.Sword;

public class Main343 {

	public static void main(String[] args) {
		Sword swo1=new Sword();
//		swo1.name="Galatine";
		swo1.name="ガラティーン";
		swo1.damage=10;
		
		Hero pla1=new Hero("ミナト", 150);
		pla1.sword=swo1;
		
//		pla1.sword=new Sword();
//		pla1.sword.name="サラマンドラ";
//		pla1.sword.damage=10;
		
		System.out.println("現在の武器は"+pla1.sword.name);
		
		
		pla1.attack();

	}

}
