package q3;
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 5000, 2000);
        Employee engineer = new Engineer("Bob", 4000, 1500);
        System.out.println(manager.name + "'s Salary: " + manager.calculateSalary());
        System.out.println(engineer.name + "'s Salary: " + engineer.calculateSalary());
     
    }
}