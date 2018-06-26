
class Bike extends Vehicle{

/**
* Example of method Overloading
* Method name must be same
*/
	
	void start(int x, int y){
		System.out.println("method 1");
	}
  
  void start(int x){
		System.out.println("method 2");
	}
	
	public static void main(String args[]){
	Bike b = new Bike();
	b.start(1);
  b.start(1,2);
	}
}
