package ex12;

public class MainABC {

	public static void main(String[] args) {
		X obj=new A();
		obj.a();
//		obj.b();
//		obj.c();
		
		Y y1=new A();
		Y y2=new B();
		
		y1.a();
		y2.a();
		System.out.println("");
		System.out.println("===================================");
		System.out.println("12-3");
		
		Y[] ar=new Y[2];
		ar[0]=y1;
		ar[1]=y2;
		for(Y y:ar) {
			y.b();
		}
		
	}

}
