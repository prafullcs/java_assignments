package assignment4;    

//part1_of_program5_in_hashmap

class Book {
    private String name;
    private double price;
    private String authorName;
    private String isbnNo;
    private String publication;

    public Book(String name, double price, String authorName, String isbnNo, String publication) {
        this.name = name;
        this.price = price;
        this.authorName = authorName;
        this.isbnNo = isbnNo;
        this.publication = publication;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getPublication() {
		return publication;
	}

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", authorName='" + authorName + '\'' +
                ", isbnNo='" + isbnNo + '\'' +
                ", publication='" + publication + '\'' +
                '}';
    }

	
}

