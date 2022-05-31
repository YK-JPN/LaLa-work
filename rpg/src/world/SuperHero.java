package world;

public class SuperHero extends Hero{
	public boolean flying;
	
	public SuperHero() {
		System.out.println("スーパーヒーローのコンストラクタが動作");
	}
	public SuperHero(String n) {
		super(n);// ここはthis.name=n;とせずに親の形に合わせた方が良い。
	}
	
	public void fly() {
		this.flying=true;
		System.out.println(this.name+"は飛び上がった！");
	}
	public void land() {
		this.flying=false;
		System.out.println(this.name+"は着地した！");
	}
	public void run() {
		System.out.println(this.name+"は、撤退した！");
		}
	
}
