package garden;

import garden.Flower.Leaf;

public class Main {

	public static void main(String[] args) {
		Flower f = new Flower("バラ肉");
		f.bloom();
		
		Rose r = new Rose("ツバキ");
		r.smell();
		r.bloom();
		
		Leaf l=f.makeLeaf("Lucy");
		System.out.println(l.getName());
	}

}
