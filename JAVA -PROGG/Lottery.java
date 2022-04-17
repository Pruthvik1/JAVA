
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 digit number for lottery");
        int guess= sc.nextInt();
        
        int g1= guess/10;
        int g2 = guess%10;
        int lottery = (int)(Math.random()*100);
       
        int l1=lottery/10;
        int l2=lottery%10;
        if (l1==g1 && l2==g2) {System.out.println("you won 10,000$  "+lottery);
            
        } else if (l1==g2 && l2==g1) {System.out.println("you won 3000$");
            
        } else if (l1==g1 ||l1==g2 ||l2==g1 ||l2==g2) {System.out.println("you won 1000$");
            
        } else {System.out.println("better luck next time!!! lottery no is "+lottery);
            
        } {
            
        }{
            
        }
        




        }
    
}
