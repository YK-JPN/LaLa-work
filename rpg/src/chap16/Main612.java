package chap16;

import java.util.ArrayList;

public class Main612 {

	public static void main(String[] args) {
		ArrayList<Integer> points=new ArrayList<Integer>();
		System.out.println("size:"+points.size());
		points.add(10);
		points.add(80);
		points.add(75);
		System.out.println("size:"+points.size());
		
		for(Integer i:points) {
			System.out.println(i);
		}
		System.out.println("index0:"+points.get(0));
		if(points.contains(80)) {
			System.out.println("ある");
		}
		
		
		
		
		
		
		
		
	}

}
