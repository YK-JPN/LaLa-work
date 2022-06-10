package chap15;

public class Main562 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<10000;i++) {
			sb.append("Java");
		}
		String s1=sb.toString();
		System.out.println(s1);
		// 文字数の確認はメモ帳コピペなり何なりでやってくれ……
		System.out.println(s1.length());
	}
	
}
