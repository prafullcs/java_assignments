package teachpersemp;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public void dispInfo() {
		System.out.println("Name: "+ name + " Age: "+age);
	}
	
}
