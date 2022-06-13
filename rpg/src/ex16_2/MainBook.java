package ex16_2;

import java.util.ArrayList;
import java.util.List;

public class MainBook {

	public static void main(String[] args) {
//		ArrayList<Book> bookList=new ArrayList<>();
		List<Book> bookList=new ArrayList<>();
		
		Book b1=new Book("ゲド戦記","アーシュラ・K・ル=グウィン");
		Book b2=new Book("夜が運ばれてくるまでに","時雨沢恵一");
		Book b3=new Book("やさしいピアノソロ","angela");
		Book b4=new Book("スッキリわかるJava入門第3版","中山清喬");
		Book b5=new Book("ポーの一族","萩尾望都");
		
		
//		bookList.add(new Book("ゲド戦記","アーシュラ・K・ル=グウィン"));
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
//		実はこんな事する必要もない。
//		book=new Book(~~~)とした直後にbookList.addを記述してやればその直下に
//		book=new Book(~~~)(()内は違う物)を再び書き入れる事ができる。
		
		for(Book b:bookList) {
			System.out.println("作品名:"+b.getTitle());
			System.out.println("著者名:"+b.getAuthor());
			System.out.println();
		}
		for(Book b:bookList) {
			System.out.println(b.getTitle()+":"+b.getAuthor());
		}

	}

}
