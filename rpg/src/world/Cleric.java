package world;

import java.util.Random;

public class Cleric {

	private String name;
	int hp=50;
	public final int HP_MAX=50;
	int mp=10;
	public final int MP_MAX=10;
	

	
	/**
	 * MPを5消費してHPを最大値まで回復する。
	 * 
	 */
	public void selfAid(){
		this.mp-=5;
//		this.mp=this.mp-5;
		this.hp=HP_MAX;
		//HP_MAXは定数なのでthisを付ける事はまず無い(好みに依る)
		System.out.println("聖職者は「セルフエイド」を唱えた！");
		System.out.println("MPを5消費して"+this.mp+"になった");
		System.out.println("HPが最大まで回復した！");
	}
	/**
	 * 「/**+Enter」で関数に対してのコメントアウトができる。
	 *　聖職者は祈る秒数で自分のMPを回復できる
	 *　但し、最大MPを超えることはできない
	 *
	 * @param praysec:祈る秒数
	 * @return:回復量
	 */
	
	
	public int pray(int praysec) throws Exception{
		int correction=new Random().nextInt(3);
		int mp_plus=praysec+correction;
		// this.mp+=mp_plus;
		if ((this.mp+mp_plus)>MP_MAX) {
			mp_plus=MP_MAX-this.mp;
		}
		this.mp+=mp_plus;
		System.out.println("聖職者は"+praysec+"秒間祈った！");
		Thread.sleep(praysec*1000);
		System.out.println("MPが"+mp_plus+"回復した！");
		return mp_plus;
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(HP_MAX, MP_MAX, hp, mp, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cleric other = (Cleric) obj;
//		return HP_MAX == other.HP_MAX && MP_MAX == other.MP_MAX && hp == other.hp && mp == other.mp
//				&& Objects.equals(name, other.name);
//	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Cleric [name=" + name + ", hp=" + hp + ", HP_MAX=" + HP_MAX + ", mp=" + mp + ", MP_MAX=" + MP_MAX + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
}
