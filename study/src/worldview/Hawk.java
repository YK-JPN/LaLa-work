package worldview;

public class Hawk extends Animal{
//	this.hp=60;
//	this.app=70;
//	this.agi=300;
//	this.size=18;
	public void run() {
		this.setHp(this.getHp()-20);
		System.out.println(this.getName()+"は大空へと飛び上がった！");
		super.run();
	}
}
