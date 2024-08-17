package bookauthr;

public class TestBook {
	public static void main(String[] args) {
		
	
		Author a = new Author("Kunal", "mywebsitedevelopment.com", 'M');
	
		Book b =new Book("Learn Java",890.51,5,a);
		
		System.out.println(b.toString());
	}
}
