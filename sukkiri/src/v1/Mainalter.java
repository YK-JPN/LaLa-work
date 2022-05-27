package v1;

public class Mainalter {

	public static void main(String[] args) throws Exception {
		String[] hand= {"グー","チョキ","パー"};
		int num;
		int ih;
		for(;;) {
			num=new java.util.Random().nextInt(3)+4;
			System.out.println("0～2の数字を入力してください");
			
			ih=new java.util.Scanner(System.in).nextInt()+1;
			System.out.println("あなたの手は"+hand[ih-1]+"です。");
			System.out.println("私の手は"+hand[num-4]+"です。");
			if((ih-num)%3==0) {
				System.out.println("あいこです、仕切り直しましょうか。");
			}else if((num-ih)%3==1) {
				System.out.println("あなたの勝ちです。対戦ありがとうございました。");
				break;
			}else if((num-ih)%3==2) {
				System.out.println("私の勝ちです。もう一度対戦しましょうか。");
				Thread.sleep(3000);
			}
		}
	}

}
