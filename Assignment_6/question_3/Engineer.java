package q3;

class Engineer extends Employee {
    public double projectAllowance;

    Engineer(String name, double baseSalary, double projectAllowance) {
        super(name, baseSalary);
        this.projectAllowance = projectAllowance;
    }

    @Override
    double calculateSalary() {
        return baseSalary + projectAllowance;
     
    }
}
