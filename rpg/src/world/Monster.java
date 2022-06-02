package world;

public abstract class Monster {
	public int hp=100;
	public int mp=10;
	public String name;
	public abstract void attack();
	public abstract void run();
}
