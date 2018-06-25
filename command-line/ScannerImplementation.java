import java.util.Scanner;
/**
* IO using scanner class
*/
class ScannerImplementation {

	public static void main (String s[]){
		
		double p=0.0,r=0.0,t=0.0,sin=0.0;
		/**
    * Scanner automatically detects the data type of the input no parse is required.
    * Create an object of scanner class
    */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n enter principal amount");
		p= sc.nextDouble();
		System.out.print("\n enter rate");
		r =sc.nextDouble();
		System.out.print("\n enter time");
		t = sc.nextDouble();
		
		sin = (p*r*t)/100;
		
		System.out.print("\n the simple interest is  "+ sin);
		
		
		
		
	}
}
