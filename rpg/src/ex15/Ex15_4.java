package ex15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex15_4 {

	public static void main(String[] args) {
		Date nt=new Date();
		// Date型だけは.nowメソッドは存在せずnew Date()の形で現在時刻を設定する。
		Calendar c=Calendar.getInstance();
		c.setTime(nt);
		int dayn=c.get(Calendar.DAY_OF_MONTH);// ここのgetのやり方に注意。
		dayn=dayn+100;
		c.set(Calendar.DAY_OF_MONTH, dayn);
		Date df=c.getTime();
		SimpleDateFormat f=new SimpleDateFormat("西暦yyyy年MM月dd日");
		String msg=f.format(df);
		System.out.println("今日から数えて100日後の日付は"+msg);
	}

}
