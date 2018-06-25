class CommandlineArguments{
/**
* Returns the sum of n number of command line arguments(Double datatype)
* To execute run java CommandlineArguments 12.0 3.0 (Example)
*/

  public static void main(String s[])
  {
    double sum=0;
    /**
    * try-catch block to check for runtime input errors
    * 
    */

    try{

      for(int i =0 ;i<s.length;i++)
      {
        sum =sum+Double.parseDouble(s[i]);
      }

    System.out.print("\n Sum is " + sum);

    }
    catch(Exception e){
      System.out.print("\n please check input");
    }

  }
}
