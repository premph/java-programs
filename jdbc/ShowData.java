import java.sql.*;
import java.util.*;
class ShowData{
	    /**
      * File 3/4 of jdbc series
      * Call this class to show data of sql table
      */
	
			public static void main(String args[]){
			
			ShowData s = new ShowData();
			
			JdbcHelper jh = new JdbcHelper();
			
			jh.getStatement();
		
			ArrayList<Product> pro = jh.getProducts();
			
			System.out.println(pro.size());
			
			for(Product p1:pro){
      
				System.out.println("name is		"+ 	p1.getName() + " price is	 " +p1.getPrice());
        
		  }
	}
	
	
}
