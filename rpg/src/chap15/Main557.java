package chap15;

public class Main557 {

	public static void main(String[] args) {
		String s1="スッキリJava";
		String s2="Java";
		String s3="java";
		String s4="";
		
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3は小文字大文字を無視して等しい");
		}
		System.out.println("s1の長さは"+s1.length());
		if(s1.isEmpty()) {
			System.out.println("s1は空文字です。");
		}
		if(s4.isEmpty()) {
			System.out.println("s4は空文字です。");
		}
	}

}
