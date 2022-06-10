package chap15;

import java.util.Calendar;
import java.util.Date;

public class Main583 {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		c.set(2019, 8,22,1,23,45);
		System.out.println(c);
		c.set(Calendar.MONTH,9);
		Date d=c.getTime();
		System.out.println(d);
		
		Date now =new Date();
		// Date型は実態としてはミリ秒の値を持っているが
		// toStringメソッドに年月日表記を持っている
		c.setTime(now);// ミリ秒をセット
		System.out.println(now);
		System.out.println(c);
		int y=c.get(Calendar.YEAR);
		System.out.println("今年は"+y+ "年です。");
		
		
		
		
		
	}

}
