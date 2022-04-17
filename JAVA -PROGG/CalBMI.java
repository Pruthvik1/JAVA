
import java.util.Scanner;

public class CalBMI {
    public static void main(String[] args) {
        System.out.println("Enter your weight in Pound");
        Scanner sc = new Scanner(System.in);
        float w= sc.nextFloat();
        System.out.println("Enter your height in inches");
        float h= sc.nextFloat();
        float wkg =(float) (w * 0.45359237);
        float hic= (float) (h * 0.0254);
        float bmi= (float)(wkg/(hic*hic));
        System.out.println("your bmi is "+ bmi);
        /**BMI < 18.5 Underweight
            18.5 ≤ BMI < 25.0 Normal
            25.0 ≤ BMI < 30.0 Overweight
            30.0 ≤ BMI Obese */
         if (bmi < 18.5) {System.out.println("Under weight"); } 
         else if ( bmi < 25.0 ) {System.out.println("normal");} 
         else if(bmi< 30.0  ) {System.out.println("Overweight");}
         else   System.out.println("Obese");  

         
            
        }

        
    }
    

