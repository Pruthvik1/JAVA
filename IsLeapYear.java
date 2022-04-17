import java.util.Scanner;

public class IsLeapYear {
   public static void main(String[] args) {
       System.out.println("prograame to check leapyear");
       System.out.println("enter a year");
       Scanner sc = new Scanner(System.in);
       double y = sc.nextDouble();
       if((y%4==0 &&y%100!=0) ||(y%400==0))
        System.out.println("leap year");
        else
        System.out.println("not");  
   }
    
}
