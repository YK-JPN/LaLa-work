package chap09;

import world.Hero;

public class Main339 {

	public static void main(String[] args) {
		Hero h1=new Hero("", 100);
		Hero h2;
//		h2=new Hero();
		h2=h1;
		h2.hp=200;
		System.out.println(h1.hp);

	}

}
