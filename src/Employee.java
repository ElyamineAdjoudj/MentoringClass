
public class Employee {
 int emp_id;
 String ename;
 String edepart;
 double salary;
 double bonus;
 boolean resident;
 
 		public Employee() {
 			emp_id=199;
 			ename="Ferhat";
 			edepart="Accounting";
 			salary=5000;
 			bonus=500;
 			resident=true;
 }
 		public Employee(int emp_id, String ename) {
 			this.emp_id=emp_id;
 			this.ename=ename;
 			
 		}
 		public Employee(int emp_id, String ename,String edepart) {
 			this(emp_id,ename);
 			this.edepart=edepart;
 			
 			
 			
 		}
 		public Employee(int emp_id, String ename,String edepart, double salary, double bonus,boolean resident) {
 			
 			this(emp_id,ename,edepart);
 			this.salary=salary;
 			this.bonus=bonus;
 			this.resident=resident;
 			
 			
 		}
 		public void setSalary(double salary) {
 			this.salary=salary;
 		}
 		public void setSalary(double salary, double bonus) {
 			this.setSalary(salary);
 			this.bonus=bonus;
 		}

 
	
	public void printEmplData() {
		
		System.out.println("The employee Id number is "+ emp_id);
		System.out.println("The employee name is "+ ename);
		System.out.println("The employee department is "+ edepart);
		System.out.println("The employee salary is "+ salary);
		System.out.println("The employee bonus is "+ bonus);
		System.out.println("Is the employee resident "+ resident);
		
		
		
		
	}
	
}
