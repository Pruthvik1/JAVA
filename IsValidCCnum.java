import java.util.Scanner;
public class IsValidCCnum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.err.println("enter your card number btw 13 to 16 digit");
     long nu= sc.nextLong();
     String num= nu+"";

     if (!(num.length()>=13 && num.length()<=16)) {
         
        System.err.println("make sure length is in bwn13 -16");
        System.exit(1);}
    
     boolean f = valid(num);
     System.err.println("your card is "+f); 
     

        
    }
    public static boolean valid(String num){
       int i =( num.length()-1);
       int odd=0;
       int even=0;
        while (i>=0) {
            if (i%2==0) {
                int a=Integer.parseInt(num.charAt(i)+"")*2;
                if( a<=9)
                   even= even+a;
                else if(a>9){
                    String g= a+"";
                    String d =g.charAt(i)+"";
                    System.err.println(d);
                    int c= Integer.parseInt(d.charAt(0)+"")+Integer.parseInt(d.charAt(0)+"");
                    even = even+c;
                }
                
            } 
            else {
                odd=odd + Integer.parseInt(num.charAt(i)+"");
                
            }
            i--;
            
        }
        int total = even+odd;
        if(total%10==0)
          return true;
        else 
         return false;
        
    }


    
}
