
import java.util.Scanner;
public class YourISBN10 {
    public static void main(String[] args) {
    System.out.println("enter 9 digit isbn no");
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    int a2 = sc.nextInt();
    int a3 = sc.nextInt();
    int a4 = sc.nextInt();
    int a5 = sc.nextInt();
    int a6 = sc.nextInt();
    int a7 = sc.nextInt();
    int a8 = sc.nextInt();
    int a9 = sc.nextInt();
String x = "running";
System.err.println(x);
     int last = (1*a1+2*a2+3*a3+4*a4+5*a5+6*a6+7*a7+8*a8+9*a9)%11;
     if (last==10)
        System.out.println("isbn no is "+a1+a2+a3+a4+a5+a6+a7+a8+a9+"X");
     else
        System.out.println("isbn no is "+a1+a2+a3+a4+a5+a6+a7+a8+a9+last);

    }
    
}
