package ex8;

import world.Cleric;

public class Main {

	public static void main(String[] args) throws Exception {
		Cleric subp1=new Cleric();
		subp1.name="atsuko";
		
		subp1.selfAid();
		subp1.pray(10);
	}

}
