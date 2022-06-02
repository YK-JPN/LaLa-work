package ex11;

public class Computer extends TangibleAsset{
	public String makername;
	public Computer(String name,int price,String color,double weight,String makername) {
		super(name,price,color, weight);
		this.makername=makername;
	}
	public String getmakername() {return this.makername;}
}
