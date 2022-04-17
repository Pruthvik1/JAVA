import java.util.Scanner;
 public class isPdrm{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String s= sc.nextLine();
        System.err.println(pdrm(s));
    }
        public static boolean pdrm(String s){
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();

            for(int i=0;i<s.length();i++){
                if(Character.isLetterOrDigit(s.charAt(i))){
                    s1.append(s.charAt(i));
                }
            }
             s2= s1.reverse();
            if(s1==s2)
                return true;
            else
                return false;

        }}
    
        
