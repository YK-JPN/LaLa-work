package chap15;

public class Main579 {

	public static void main(String[] args) throws Exception {
		long start=System.currentTimeMillis();
		Thread.sleep(5000);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		long end=System.currentTimeMillis();
		
		System.out.println("処理に掛かった時間(ミリ秒スケール)は"
				+ (end-start));
		
	}

}
