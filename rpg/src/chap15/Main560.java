package chap15;

public class Main560 {

	public static void main(String[] args) {
		String s1="Java programming";
		System.out.println("文字列s1の4文字目以降は"+s1.substring(3));
		System.out.println("文字列s1の4～8文字目は"+s1.substring(3,8));
		// カウントは0スタート、終点指定はその番号(今回は8)の手前で区切られる
		String s2=s1.replace("Java","PHP");
		//replaceメソッドは入れ替える操作だけで代入を行っている訳ではない
		//なので今回は別でs2に代入する操作を行っている。
		System.out.println(s2);
		System.out.println("文字列s1の4文字目以降は"+s2.substring(3));
		System.out.println("文字列s1の4～8文字目は"+s2.substring(3,8));
	}

}
