import java.util.Scanner;

class Employee {
    private String firstname;
    private String lastname;
    private double salary;

    public Employee(String firstname, String lastname, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    public double calculateIncreasedSalary() {
        return salary * 1.1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee 1 details:");
        System.out.print("First Name: ");
        String firstName1 = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName1 = sc.nextLine();
        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine(); 
        Employee emp1 = new Employee(firstName1, lastName1, salary1);

        System.out.println("Enter Employee 2 details:");
        System.out.print("First Name: ");
        String firstName2 = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName2 = sc.nextLine();
        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();
        sc.nextLine();         
        Employee emp2 = new Employee(firstName2, lastName2, salary2);

        
        System.out.println("Employee 1 Details:");
        System.out.println("First Name: " + emp1.getFirstname());
        System.out.println("Last Name: " + emp1.getLastname());
        System.out.println("Salary: " + emp1.getSalary());

        System.out.println("Employee 2 Details:");
        System.out.println("First Name: " + emp2.getFirstname());
        System.out.println("Last Name: " + emp2.getLastname());
        System.out.println("Salary: " + emp2.getSalary());

        double increasedSalary1 = emp1.calculateIncreasedSalary();
        double increasedSalary2 = emp2.calculateIncreasedSalary();

        System.out.println("Increased Salary of Employee 1: " + increasedSalary1);
        System.out.println("Increased Salary of Employee 2: " + increasedSalary2);

        
    }
}
