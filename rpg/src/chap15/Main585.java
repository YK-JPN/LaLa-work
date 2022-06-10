package chap15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main585 {

	public static void main(String[] args) throws Exception{
		SimpleDateFormat f=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// ↑は入力方法・表示方法を共に設定している。
		// このファイルの前半では入力、
		// 後半では表示でこの設定が生きている事を証明している。
		Date d=f.parse("2020/09/22 01:23:45");
		System.out.println(d);
		
		Date now=new Date();
		String s=f.format(now);
		String sd=f.format(d);
		System.out.println("現在の年月日・時刻は"+s+"です。");
		System.out.println(sd);
		
		// Java8以降ではDate型ではなくLocalDate型の使用が推奨されている。
		// どちらを選ぶかは都度話し合う等して決めておく必要がある。
	}

}
