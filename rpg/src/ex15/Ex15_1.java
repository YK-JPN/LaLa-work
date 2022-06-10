package ex15;

public class Ex15_1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=100;i++) {
			sb.append(i).append(",");
		}
		String s=sb.toString();
		System.out.println(s);
		
		String[] a=s.split(",");
//		System.out.println(a);
		
		for(String value:a) {
			System.out.println(value);
		}
	}
	

}
