package world;

public class Inn {
	public void checkin(Hero h) {
		h.setHp(100);
		System.out.println(h.getName()+"は、眠って回復した！");
	}
}
