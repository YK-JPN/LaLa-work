package chap17;

public class Tool {
	public int inputNum(){
		System.out.print("数字を入力して下さい。 > ");
		String numTxt=new java.util.Scanner(System.in).nextLine();
		int num=Integer.parseInt(numTxt);
		return num;
		
	}
	
}
