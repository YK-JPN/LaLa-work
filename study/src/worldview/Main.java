package worldview;

public class Main {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("イッヌ");
		dog.eat();
		dog.run();
		dog.roar();
		for(int i=0;i<10;i++) {
			dog.run();
		}
		
		
		Hawk hawk=new Hawk();
		hawk.setName("ワッシャー");
		hawk.eat();
		hawk.run();
	}

}
