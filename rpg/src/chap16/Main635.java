package chap16;

import java.util.HashMap;
import java.util.Map;

public class Main635 {

	public static void main(String[] args) {
		Map<String,Integer> prefs=new HashMap<String,Integer>();
		prefs.put("京都府",255);// R4->255.1
		prefs.put("東京都",1261);//R4->1399.5
		prefs.put("熊本県",181);// R4->171.8
		// addメソッドではなくputメソッドを用いる事に注意。
		
		int tokyo=prefs.get("東京都");
//		System.out.println("東京都の人口は"+tokyo+"万人");
//		prefs.remove("京都府");
		prefs.put("熊本県", 182);
		int kumamoto=prefs.get("熊本県");
//		System.out.println("熊本県の人口は"+kumamoto+"万人");
		
		
		for(String k:prefs.keySet()) {
			int value=prefs.get(k);
			System.out.println(k+"の人口は"+value+"万人です。");
		}

	}

}
