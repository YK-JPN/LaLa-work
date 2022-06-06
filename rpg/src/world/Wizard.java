package world;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp<0) {
			this.hp=0;// この部分をhp=0;にすれば後ろのelseは必要なくなる。
		}else {
			this.hp = hp;
		}
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		if(mp<0) {
			throw new IllegalArgumentException("Lack of MP !!");
		}else {
			this.mp = mp;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<3) {
			throw new IllegalArgumentException("Name Error");
		}else {
			this.name = name;
		}
	}
	public Wand getWand() {
		return wand;
	}
	public void setWand(Wand wand) {
		if(wand==null) {
			throw new IllegalArgumentException("No Wand !!");
		}
			this.wand = wand;
	}
	public Wizard(int h,int m) {
		this.hp=h;
		this.mp=m;
	}
	public Wizard(Wand wand) {
		this.setWand(wand);
	}
	
	public Wizard(String n,int h,int m,Wand w) {
		this.setHp(h);
		this.setMp(m);
		this.setName(n);
		this.setWand(w);
	}
	
	public void heal(Hero h){
		if(this.wand.getWname()==null) {
			throw new IllegalArgumentException("No Wand !!");
		}else {
			int basepoint=10;
			int recoverpoint=(int)(basepoint*this.wand.getWpower());
			h.setHp(h.getHp()+recoverpoint);
			System.out.println(this.name+"は「ヒール」を唱えた！");
			System.out.println(h.getName()+"のHPを"+recoverpoint+"回復した！");
			System.out.println(h.getName()+"のHPは"+h.getHp()+"になった！");
		}
	}

	
	public void attack(Matango m) {
		this.mp-=10;
		m.hp-=30;
		System.out.println(this.name+"の攻撃！");
		System.out.println("敵に30のダメージ！");
		
	}
	
	public void sleep() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public void fireball(Matango m) {
		m.hp-=50;
		this.mp-=30;
		System.out.println(this.name+"は火の玉を放った！！");
		System.out.println("敵に50ポイントのダメージ！");
	}
}
