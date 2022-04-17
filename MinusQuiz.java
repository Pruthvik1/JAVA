
import java.util.Scanner; 
public class MinusQuiz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Your Minus Qiz ");
        int marks= 0;
        int i=0;
        String output = " ";
        long startTime = System.currentTimeMillis();
 
        while(i!=5){i++;
            int a1= (int)(Math.random()*11);
            int a2= (int)(Math.random()*11);
            System.err.println("what is "+a1+" - "+a2+" ?");
            int ans = sc.nextInt();
            if(ans == (a1-a2)) 
            { marks++;
                System.err.println("correct");} 
             else 
                System.err.println("wrong");
        output += "\n" + a1 + "-" + a2 + "=" + ans +((a1 - a2 == ans) ? " correct" : " wrong");

        }
        long endTime = System.currentTimeMillis();
        long testTime = (endTime - startTime)/600;
        System.err.println("you get "+marks+" out of 5 and taken time is "+testTime+" seconds "+output);
        
    }
    
}
