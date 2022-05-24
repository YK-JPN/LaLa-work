package CHAP5;

public class Ex4_4 {

	public static void main(String[] args) {
		int[] numbers=new int[2];
	}
	
	public static void junbi() {
		numbers[0]=new java.util.Random().nextInt(9)+1;
	    do {
	    	numbers[1]=new java.util.Random().nextInt(9)+1;
	    }while(numbers[0]==numbers[1]);
	}
	
	public static void kakunin() {
		System.out.println(numbers[0]+" "+numbers[1]);
	}
	
	public static void input() {
		System.out.println("1桁の数字を入力してください。");
		int input =new java.util.Scanner(System.in).nextInt();
	}
	
	public static void hantei() {
		String mes="";
		for(int i=0;i<numbers.length;i++){
		    mes=(input==numbers[i])?"アタリ！！！！！！！！！！！！":"";
			System.out.print(mes);
			}
		}
			
		
	}
