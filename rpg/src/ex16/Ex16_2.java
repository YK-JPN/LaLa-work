package ex16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex16_2 {	
	public static void main(String[] args) {
		List<HeroEx16> a=new ArrayList<>();
		HeroEx16 h1=new HeroEx16("斎藤");
		HeroEx16 h2=new HeroEx16("鈴木");
		a.add(h1);
		a.add(h2);
		for(HeroEx16 h:a) {
			System.out.println(h.getName());
		}
		
		Map<HeroEx16,Integer> m=new HashMap<>();
		m.put(h1, 3);
		m.put(h2, 7);
		for(HeroEx16 h:m.keySet()) {
			System.out.println(h.getName()+"が倒した敵の数＝"+m.get(h));
		}

	}

}
