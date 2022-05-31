package mainmethod;

import worldview.Dog;
import worldview.Hawk;

public class Main {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="イッヌ";
		dog.eat();
		dog.run();
		dog.roar();
		for(int i=0;i<10;i++) {
			dog.run();
		}
		
		
		Hawk hawk=new Hawk();
		hawk.name="ワッシャー";
		hawk.eat();
		hawk.run();
	}

}
