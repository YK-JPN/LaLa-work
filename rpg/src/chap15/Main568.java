package chap15;

public class Main568 {

	public static void main(String[] args) {
		String n1="T1234567";
		if(isValidPlayerName(n1)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		String n2="isValid1";
		String n3="HIKONYAN";
		if(isValidPlayerName(n2)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		if(isValidPlayerName(n3
				)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		String s="abc,def:ghi";
		String w=s.replaceAll("[beh]", "X");
		System.out.println(w);

	}
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	

	
	

}
