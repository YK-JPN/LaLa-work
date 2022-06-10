package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IchimanDays {

	public static void main(String[] args) throws Exception{
		System.out.print("ここに誕生日を入力　>");
		SimpleDateFormat f=new SimpleDateFormat("yyyy/MM/dd");
		String is=new java.util.Scanner(System.in).nextLine();
		Date bd=f.parse(is);
		Date now=new Date();
		System.out.println(now.getTime());
		System.out.println(bd.getTime());
		System.out.println(now.getTime()-bd.getTime());
		System.out.println((int)(now.getTime()-bd.getTime()));
//		long day=(int)(now.getTime()-bd.getTime())/(24*60*60*1000);
		long day=(now.getTime()-bd.getTime())/(24*60*60*1000);
		int second=(int)(now.getTime()-bd.getTime());
		System.out.println(second);
//		int day=second/(1000*60*60*24);
		System.out.println(day);
		int dayf=(int)day;
		System.out.println(dayf);
	}

}
