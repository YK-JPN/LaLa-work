package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main655 {

	public static void main(String[] args) {
		FileWriter fw=null;
		String txt=null;
		try {
			fw=new FileWriter("data.txt");
			txt="Hello";
			fw.write(txt);
			
		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("何らかの例外が発生しました。");
		}finally{
			if(fw!=null) {
				try {
					fw.close();
				}catch(IOException e){
					;
				}
			}
		}
//		|(または)を使う事で2種類のエラーを１つのcatchで受ける事ができる。
		
		
		
//		try {
//			FileWriter fw=new FileWriter("data.txt");
//			fw.write("Hello!");
//			fw.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//			System.out.println("エラーです、中断します。");
//		}

	}

}
