public class Product{
	/**
  * File 1/4 of jdbc series
  * This is the Bean ofthe jdbc CL application
  * Class variables for each row of table
  */
	int id;
	String name;
	int price;
	
  /** 
  * Method for restricting direct access of variables
  */
  
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
	
	Product(int id,String name,int price){
		this.name = name;
		this.id=id;
		this.price=price;
		
	}
  
	  /**
    * Empty Constructor for handling no argument constructors
    */
	Product(){
		
	}
}
