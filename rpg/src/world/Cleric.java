package world;

import java.util.Random;

public class Cleric {

	public String name;
	int hp=50;
	final int HP_MAX=50;
	int mp=10;
	final int MP_MAX=10;
	
	
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
}
