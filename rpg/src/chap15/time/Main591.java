package chap15.time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main591 {

	public static void main(String[] args) {
		Instant i1=Instant.now();
		System.out.println(i1);
		
		Instant i2=Instant.ofEpochMilli(1600705425827L);
		long l=i2.toEpochMilli();
		
		ZonedDateTime z1=ZonedDateTime.now();
		ZonedDateTime z2=ZonedDateTime.of
				(2020, 1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
		// ZonedDateTimeは必ず引数7つが必要。
		// Instantクラスはミリ秒スケールを扱う「厳密な」時刻情報であり、
		// それにZoneIdの情報が付与されているのがZonedDateTimeクラスである。
		// よってZonedDateTimeクラスに引数欠け等の情報の欠落・省略は許されない。
		Instant i3=z2.toInstant();
		ZonedDateTime z3=i3.atZone(ZoneId.of("Europe/London"));
		
		System.out.println("======================================================");
		System.out.println("z1:"+z1);
		System.out.println("z2:"+z2);
		System.out.println("z3:"+z3);
		System.out.println("i3:"+i3);
		System.out.println("l:"+l);
		System.out.println("======================================================");
		
		System.out.println("現在日時:"
				+ z1.getYear()+z1.getMonth()+z1.getDayOfMonth());
		System.out.println("東京:"
				+ z2.getYear()+z2.getMonth()+z2.getDayOfMonth());
		System.out.println("ロンドン:"
				+ z3.getYear()+z3.getMonth()+z3.getDayOfMonth());
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指し示しています。");
		}
		
		
		
		
		
		
	}

}
