package chap15.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main594 {

	public static void main(String[] args) {
		LocalDateTime l1=LocalDateTime.now();
		System.out.println("現在時刻l1:"
				+ l1);
		LocalDateTime l2=LocalDateTime.of(2020, 1,1,9,5,0,0);
		// 引数は5つ迄であっても大丈夫(秒数の欠けは許される)
		System.out.println("過去の時刻l2:"
				+ l2);
		ZonedDateTime z1=l2.atZone(ZoneId.of("Europe/London"));
		// z1はl2に地域情報が付与された物で時差による時刻変更は発生しない
		LocalDateTime l3=z1.toLocalDateTime();
		
		System.out.println("z1:"
				+ z1);
		System.out.println("l3:"
				+ l3);

	}

}
