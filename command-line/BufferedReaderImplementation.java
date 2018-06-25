import java.io.*;

class BufferedReaderImplementation {
	public static void main (String s[]){
		
		double p=0.0,r=0.0,t=0.0,sin=0.0;
		/**
    * BufferedReader read input as string so parse to required data type is required
    * BufferedReader takes ISR object as argument which in turn takes System.in as argument
    */
    
		BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
    
    /** unlike Scanner, BR needs parsing their is possible dataypr mis-match
    * hence try-catch block is used
    */
    
		try{
			
		System.out.print("\n enter principal amount");
		p = Double.parseDouble(br.readLine());
		
		System.out.print("\n enter rate");
		r = Double.parseDouble(br.readLine());
		
		System.out.print("\n enter time");
		t = Double.parseDouble(br.readLine());
		
		sin = (p*r*t)/100;
		
		System.out.print("\n the simple interest is  "+ sin);
		
		}
		catch(Exception e){
			System.out.print(e);
		}
		
		
	}
}
