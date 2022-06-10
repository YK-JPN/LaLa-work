package chap16.ex;

import java.util.ArrayList;
import java.util.List;

public class MainStreamOfUser {

	public static void main(String[] args) {
		List<User> userList=new ArrayList<>();
		User u1=new User("染谷将太",29);
		userList.add(u1);
		User u2=new User("二階堂ふみ",27);
		userList.add(u2);
		User u3=new User("窪塚洋介",42);
		userList.add(u3);
		final String FORMAT="%-5s %-2d";
		
		
		for(User u:userList) {
//			System.out.println(u.getName()+"->"+u.getAge());
			System.out.printf(FORMAT,u.getName(),u.getAge());
			System.out.println("");
		}

	}

}
