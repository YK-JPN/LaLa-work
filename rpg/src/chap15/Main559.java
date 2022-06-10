package chap15;

public class Main559 {

	public static void main(String[] args) {
		String s1="Java and JavaScript";
		if(s1.contains("Java")) {
			System.out.println("文字列s1はJavaを含んでいます");
		}
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1はJavaが末尾にあります");
		}
		if(s1.startsWith("Java")) {
			System.out.println("文字列s1はJavaが文頭にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は"
				+ s1.indexOf("Java"));
		// 存在しない語句を入れた場合indexOfの値は-1になる
		
		System.out.println("文字列s1で最後にJavaが登場する位置は"+s1.lastIndexOf("Java"));
		
		
		
		
		
	}

}
