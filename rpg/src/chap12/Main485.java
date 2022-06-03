package chap12;

import world.Deathbat;
import world.Goblin;
import world.Monster;
import world.Slime;

public class Main485 {

	public static void main(String[] args) {
		Monster[] ms=new Monster[3];
		ms[0]=new Slime();
		ms[1]=new Goblin();
		ms[2]=new Deathbat();
		for(Monster m:ms) {
			m.run();
		}

	}

}
