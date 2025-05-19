import java.util.Scanner;
interface Taxable {
    double salesTax = 0.07;
    double incomeTax = 0.105;

    void calcTax();
}
class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void calcTax() {
        double tax = salary * incomeTax;
        System.out.println("Income Tax for employee " + name + " is: " + tax);
    }
}
class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax() {
        double tax = price * salesTax;
        System.out.println("Sales Tax on product ID " + pid + " (unit price): " + tax);
    }
}


public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Employee ID, Name and Salary:");
        int empId = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        Employee emp = new Employee(empId, name, salary);
        emp.calcTax();


        System.out.println("\nEnter Product ID, Price and Quantity:");
        int pid = sc.nextInt();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product prod = new Product(pid, price, quantity);
        prod.calcTax();

        sc.close();
    }
}
