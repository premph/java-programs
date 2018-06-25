import java.util.*;
class Employee {

  /**
  * File 1/2 of ArrayList
  * Base class of ArrayList
  */
  
	private String name;
	private int id;
	private String dept;
	
	Employee(int id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	Employee(){
		
	}
	
	public void detail(){
		System.out.print(this.id+"  ");
		System.out.print(this.name+"  ");
		System.out.println(this.dept+"  ");
	}
	public void setName(String n){ //setter mutator
		this.name = n;
	}
	public String getName(){ //accessor
		return this.name;
	}
	
	public void setId(int n){ //setter mutator
		this.id = n;
	}
	public int getId(){ //accessor
		return this.id;
	}
	
	public void setDept(String n){ //setter mutator
		this.dept = n;
	}
	public String getDept(){ //accessor
		return this.dept;
	}

}
