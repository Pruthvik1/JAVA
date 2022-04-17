import java.util.Scanner;

public class MaxOf3 {
public static void main(String[] args) {
        System.err.println("the max of 3 and 9 is "+max(3,9));
        System.err.println("the max of 3.0 and 9.6 is "+max(3.0f,9.6f));
            System.err.println("the max of 3.0 and 9.6 and 9.9 is "+max3(3.0f,9.6f,9.9f));}
        public static int max(int a, int b) {
            if (a > b)
             return a;
            else
              return b;
             }
     
  public static float max(float a, float b){
    if(a>b) 
      return a ;
    else
       return b;
    
}
public static float max3(float a, float b, float c){
    if (max(a,b)>c) 
        return max(a,b);
        
    else 
       return c;
}}
    
    
 


        
    
