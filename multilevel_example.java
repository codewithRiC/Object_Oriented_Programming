class Employee {

    public String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        //super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }
}




class Manager extends Employee {

    private double bonus;

    Manager(String name, int id, double salary, int bonus) {
       
    	super(name, id, salary);
    	 this.bonus = bonus;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();

        return (baseSalary + baseSalary * (bonus / 100));

    }

    @Override
    public String toString() {
        return "name=" + name + ", id=" + getId() + ", salary=" + getSalary() + ", bonus=" + bonus ;
    }
}
 class MultiLevel extends Manager{

	MultiLevel(String name, int id, double salary, int bonus) {
		super(name, id, salary, bonus);
		
	}

	public static void main(String[] args) {
		

		MultiLevel m1 = new MultiLevel("Rishi",1001,50000,55);
		System.out.println(m1);
	}

}