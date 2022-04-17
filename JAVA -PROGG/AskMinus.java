
import java.util.Scanner;
public class AskMinus {
    public static void main(String[] args) {
        int a=(int)(Math.random()*100);
        int b=(int)(Math.random()*100);
        if(a<b){
            int temp=a;
            a=b;
            b=  temp;
        }

        int ca= a-b;
        System.out.println("what is "+a+" - "+b+" ?");
        Scanner sc= new Scanner(System.in);
        int ans = sc.nextInt();
        if(ca == ans)
          System.out.println("correct answer");
          else
        System.out.println("wrong correct is "+ ca +" you shoud practice");

        
    }
    
}
