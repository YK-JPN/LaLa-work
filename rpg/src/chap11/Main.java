package chap11;

import world.Dancer;
import world.Hero;
import world.Matango;

public class Main {

	public static void main(String[] args) {
		Matango m1=new Matango();
		Dancer dancer=new Dancer();
		dancer.name="サンダー";
		dancer.dance();
		dancer.attack(m1);
		dancer.run();
		dancer.sleep();
		
		Hero h1=new Hero("アタタタ");
		h1.run();
		h1.attack(m1);
		
		

	}

}
