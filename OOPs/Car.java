class Car extends Vehicle{

  /**
  * Example of method overriding
  * Car class exends Vehicle class and can access all non-private method of it
  * We used @override annotation to explicitly check if method overriding occurs or not
  */
  
	@Override
	void start(){;
		
		System.out.println("superclass's method overridden");
		
		
	}

	public static void main(String args[]){
	Car c = new Car();
	c.start();
	}
}
