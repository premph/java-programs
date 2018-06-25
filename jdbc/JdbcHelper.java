import java.sql.*;
import java.util.*;

public class JdbcHelper{

  /**
  * File 2/4 of jdbc series
  * This is a services file of jdbc CL application
	* Variables having sql table url and login credentials ( Different for each user)
  */
  
	String url = "jdbc:mysql://localhost:3306/stock";
	String user = "root";
	String password="admin";
	
	Connection con = null;
	Statement st = null;
	ResultSet rs;
	
	
	/**
  * Method to establish a connection b/w java and sql returns a Statement object
  */
  
	public Statement getStatement(){
		try{
			con = DriverManager.getConnection(url,user,password);
			st = con.createStatement();
			if(st == null)
				System.out.println("st is null");

			
		}
		catch(Exception e){
			System.out.println("in gs"+e.toString());
		}
	return st;
	}
	
  /**
  * Method to fetch all data from sql table
  * Returns ArrayList a collection framework datatype (returns a Product class object)
  * Executes the query 
  */
  
	public ArrayList<Product> getProducts(){
		
		ArrayList<Product> plist = new ArrayList<Product>();
		try{
			System.out.println("calling get products");
			String sql = "select * from product";
		  rs = st.executeQuery(sql);
	
		while(rs.next()){
				Product p = new Product();
				p.setName( rs.getString("name") );
				p.setId(rs.getInt("id"));
				p.setPrice(rs.getInt("price") );
				
				plist.add(p);
			}
		}
		
		catch(Exception e){
			System.out.println("error in get pro"+e.toString());
		}

		return plist;
	}
	
  /**
  * Method to insert a tuple in the sql table
  */
  
	public void insert(String name, int price){
		
		try{
		System.out.println("calling insert");
    String sql = "insert into product (name,price) values('"+name+"',"+price+")";
   	int x = st.executeUpdate(sql);
			
			System.out.println(x);
		}
		catch(Exception e){
			System.out.println("in insert "+e.toString());
		}
		
	}
	JdbcHelper(){
		System.out.println("jdbc helper const");
		this.st=getStatement();
		if(this.st == null)
				System.out.println("Statement not created");
	}
}
