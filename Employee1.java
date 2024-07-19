package apjfsa;

public class Employee1 {

	    protected String name;
	    protected double salary;

	    public Employee1(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public double totalSalary() {
	        return salary;
	    }
	}

	class PermanentEmployee extends Employee1 {
	    private double bonus;

	    public PermanentEmployee(String name, double salary, double bonus) {
	        super(name, salary);
	        this.bonus = bonus;
	    }

	    @Override
	    public double totalSalary() {
	        return super.totalSalary() + bonus;
	    }
	}

	class ContractEmployee extends Employee1{
	    private int contractDuration;

	    public ContractEmployee(String name, double salary, int contractDuration) {
	        super(name, salary);
	        this.contractDuration = contractDuration;
	    }

	    @Override
	    public double totalSalary() {
	        return super.totalSalary() * contractDuration;
	    }
	

	    public static void main(String[] args) {
	        PermanentEmployee permanentEmp = new PermanentEmployee("John", 50000, 10000);
	        ContractEmployee contractEmp = new ContractEmployee("Alice", 40000, 6);

	        System.out.println("Total salary of permanent employee: " + permanentEmp.totalSalary());
	        System.out.println("Total salary of contract employee: " + contractEmp.totalSalary());
	    }
	}


