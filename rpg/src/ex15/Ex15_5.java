package ex15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex15_5 {

	public static void main(String[] args) {
		LocalDate n=LocalDate.now();
		LocalDate f=n.plusDays(100);
		
		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(f.format(fmt));

	}

}
