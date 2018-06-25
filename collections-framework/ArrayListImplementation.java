import java.util.*;
class ArrayListImplementation{
  /**
  * File 2/2 of ArrayList
  * Example of ArrayList<E> of collection frameworks
  * Generic ArrayList since java 2 can store object as class or wrapper class object
  */
  
	public static void main(String args[]){
		ArrayList<Employee> details = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"prem","sales");
		Employee e2 = new Employee(2,"prajwal","research");
		Employee e3 = new Employee(3,"saaket","marketing");
		Employee e4 = new Employee(4,"garima","marketing");
		Employee e5 = new Employee();
		e5.setName("somya");
		e5.setId(5);
		e5.setDept("research");
		
		details.add(e1);
		details.add(e2);
		details.add(e3);
		details.add(e4);
		details.add(e5);
		details.add(e5);
		
		for(Employee emp:details){
			
				emp.detail();
			
		}
		
		
	}
}
