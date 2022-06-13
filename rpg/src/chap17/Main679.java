package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main679 {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("data.txt");){
			fw.write("Hello!");
		}catch(IOException|NullPointerException e){
			System.out.println("何らかの例外が発生しました。");
		}

	}

}
