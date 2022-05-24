package ex5;

public class Ex5_1 {
	public static void main(String[] args) {
		introduceOneself();
	}

	public static void introduceOneself() {

		String name;
		int age;
		double height;
		char zoodiac;

		name = "貝塚未起雄";
		age = 32;
		height = 180.8;
		zoodiac = '戌';

		System.out.println("僕の名前は" + name + "です。");
		System.out.println("年齢は" + age + "になります。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("生まれ年は" + zoodiac + "になります。");
	}

}
