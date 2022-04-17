import java.util.Scanner;

public class SeriesSum {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int sum=0;
        int i=1;
		while( i <= a )
             {
            sum = sum +i;
            System.out.print(i);
            if(i<a)
               System.out.print("+");
            i++;
        }
        System.out.println("\n");
        System.out.println("the sum is "+sum);
    }
    
}
