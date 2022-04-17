import java.util.Scanner;
public class MatrixGenerator {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.err.println("Enter a number to generate (number*number) matrix ");
        int n = sc.nextInt();
        matrix(n);}
        public static  void matrix(int n) 
        {
            for(int i =0;i<n;i++){ 

            for(int j=0;j<n;j++){
            int A =(int)(0+Math.random()*10);

                System.err.print(A+" ");

            }
                System.err.println(" ");
            }
            
            
        }
    }

   
    
    

