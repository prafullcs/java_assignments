package bookauthr;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book(String name, double price, int qty, Author author) {
		this.author = author;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	void dispInfo() {
		System.out.println("Book Name: "+name+ " Author: "+author.toString()+" Price: "+price+" Quantity: "+ qty);
	}
	public String getName(){
		return name;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public String getAuthor() {
		return author.toString();
	}
	public int getQty() {
		return getQty();
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public String toString() {
	
	return name+author.getName()+" ("+author.getGender()+")"+" email by "+author.getEmail();
	}
}
