package garden;

public class Flower {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Flower() {
		this.name = "花";
	}
	public Flower(String name) {
		this.name =name;
	}
	
	public void bloom() {
		System.out.println(this.getName() + "が咲いた。");
	}

	public Leaf makeLeaf(String name) {
		Leaf l=new Leaf(name);
		return l;
	}
	
class Leaf{
	private String name;
	public Leaf(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
}