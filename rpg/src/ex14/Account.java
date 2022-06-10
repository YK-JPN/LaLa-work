package ex14;

public class Account {

	public String accountnumber;
	public int balance;
	public String toString() {
		return "\\"+this.balance+"(口座番号:"+this.accountnumber+")";
	}
	
//	public boolean equals(Account a) {
//		if(this.accountnumber.trim().equals(a.accountnumber.trim())) {
//			return true;
//		}
//		return false;
//	} ↑使えないので注意、オーバーロードなので
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Account) {
			Account a=(Account)o;
			String an1=this.accountnumber.trim();
			String an2=a.accountnumber.trim();
			if(an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
	// .equals()を作ったら、hashCode()も作成する。
	
	@Override
	public int hashCode() {
		int result=accountnumber.hashCode();
		result=result*31+Integer.hashCode(balance);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
