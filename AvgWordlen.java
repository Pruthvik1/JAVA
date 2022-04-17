import java.util.Scanner;
 public class AvgWordlen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("enter a Line To Check youR avg Word Length");
        String s= sc.nextLine();
        String[] wlen= s.split(" ");
        int a=0;
        for (String string : wlen) {
                a+=string.length();
            
        }
        float result= (float)a/(float)wlen.length;
        System.err.println("Your avg is "+result);

        
    }
}