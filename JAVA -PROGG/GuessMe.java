import java.util.Scanner;
public class GuessMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Lets play Guess a magic Number bwn 0 to 100 Gunies");
        
        int guess= (int)(0+Math.random()*101);
        int count=1;
        int a =111;
        while(a!=guess){count++;
             a = sc.nextInt();
            if(a>guess)
             System.err.println("too high");
            else
            System.err.println("too low");
            if(count>3) {
                System.err.println("wrong correct is "+guess+" try again");
                System.exit(1);}
    }
System.err.println("you guess "+guess+" correct within "+count+" attempts!!!");
    }
    
}
