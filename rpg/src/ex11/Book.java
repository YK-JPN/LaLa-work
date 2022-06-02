package ex11;

public class Book extends TangibleAsset{
	public String isbn;
	
	public Book(String name,int price,String color,double weight,String isbn) {
		super(name,price,color,weight);
		this.isbn=isbn;
	}
	
	public String getisbn() {return this.isbn;}
}
