package ex11;

public abstract class TangibleAsset extends Asset
									implements Thing{
	public String color;
	public double weight;
	
	public TangibleAsset(String name,int price,String color,double weight) {
		super(name,price);
		this.color=color;
		this.weight=weight;
	}
	
	public String getcolor() {return this.color;}
	@Override
	public double getweight() {
		return this.weight;
	}

	@Override
	public void setweight(double weight) {
		this.weight=weight;		
	}
	
}
