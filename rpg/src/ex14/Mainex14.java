package ex14;

import java.util.ArrayList;
import java.util.List;

public class Mainex14 {

	public static void main(String[] args) {
		Account a=new Account();
		a.accountnumber="4649";
		a.balance=1592;
		System.out.println(a);
		
		Account a1=new Account();
		Account a2=new Account();
		Account a3=new Account();
		
		a1.accountnumber=" 4649";
		a2.accountnumber="4649 ";
		a3.accountnumber=" 4649  ";
		
		if(a.equals(a1)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		
		if(a.equals(a2)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		
		if(a.equals(a3)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		
		// Account型かObject型、どちらでの記述の方が良いかの検討を以下で行う。
		
		a1.accountnumber="4649";
		a1.balance=1582;
		List<Account>alist=new ArrayList<>();
		alist.add(a1);
		showList(alist);
		a1=new Account();
		a1.accountnumber="4649";
		a1.balance=1592;
		alist.remove(a1);
		showList(alist);
		
	}
	private static void showList(List<Account> alist) {
		for(Account a:alist) {
			System.out.print("accountnumber:"+a.accountnumber);
			System.out.println(" balance:"+a.balance);
		}
		System.out.println("要素数:"+alist.size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
