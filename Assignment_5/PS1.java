class Animal {
	public void makeSound() {
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("bow bow");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("meow meow");
	}
}
public class PS1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.makeSound();
		Dog d = new Dog();
		d.makeSound();
		Cat c = new Cat();
		c.makeSound();
	}
}