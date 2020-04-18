
public class EmployeeApplication {

	public static void main(String[] args) {
	
		Employee e1 =new Employee();
	    e1.printEmplData();
	    System.out.println("----------------");
	    Employee e2=new Employee(101,"Steve");
	    e2.printEmplData();
	    System.out.println("----------------");
	    System.out.println("----------------");
	    Employee e3=new Employee(200,"Sam","IT");
        e3.printEmplData();
        
        System.out.println("----------------");
	    System.out.println("----------------");
	    Employee e4=new Employee(202, "Karl", "Not assigned", 4000, 1200, true);
	    e4.printEmplData();
	    
        System.out.println("----------------");
	    System.out.println("----------------");
	    e4.setSalary(5000, 600);
	    e4.printEmplData();
	    
	}

}
