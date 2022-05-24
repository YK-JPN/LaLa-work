package ex5;

public class Ex5_2 {

	public static void main(String[] args) {
		email("メールが読めーる","mail.sample@email.php","結構毛だらけ猫灰だらけ");
	}
	
	public static void email(String title,String address,String text) {
		System.out.println(address+"に、以下のメールを送信しました。");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}

}
