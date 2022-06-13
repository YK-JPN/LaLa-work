package chap17.train;

public class MainTool {

	public static void main(String[] args) {
		Tool t = new Tool();
		int num = t.inputNum();
		System.out.println("入力値:" + num+" -> (inputNum)");

//		int num = 0;
//		try {
//			num=t.inputNum();
		
//		}catch(NumberFormatException e) {
//			e.printStackTrace();
//		}
//		System.out.println("入力値:"+num);
	
	
	int n=t.getNum();
	System.out.println("入力値:"+n+" -> (getNum)");
	
	
	
	}
}
