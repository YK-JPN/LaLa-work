package world;

public abstract class Character {
	public String name;
	public int hp;
	
	public void run() {
		System.out.println(this.name+"は逃げ出した！");
	}
	public abstract void attack(Matango m);
	public abstract void sleep();
	public void fireball(Matango m) {
		System.out.println("袋からチャッカマンを取り出した");
	}
}
