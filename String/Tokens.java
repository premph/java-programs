import java.util.StringTokenizer;  
public class Tokens{  

**
* String tokenizer is used to split string into tokens
* we can iterate over the string using tokenizer
*/

 public static void main(String args[]){
 String line = "I love java programming";
 String delimiter =" ";
   StringTokenizer st = new StringTokenizer(line,delimiter);  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
} 
