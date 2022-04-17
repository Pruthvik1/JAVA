import java.util.Scanner;
public class Str1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /**System.err.println("enter your SSN no to validate/(DDD-DD-DDDD/)");
        String ssn= sc.nextLine();
        char a='-';
        char s4=ssn.charAt(3);
        char s7=ssn.charAt(6);
        if (s4==a &&s7==a) {
            System.err.println("your SSN is correct "+ ssn);
            
        } else 
            System.err.println("incorrect!!!");
    System.err.println("your string/'s lenght is "+ssn.length()+" and first char is "+ssn.charAt(0));*/
    System.err.println("enter a char");
    String vowel=sc.nextLine();
    System.err.println(vowel.length());
    if (vowel.length()> 1)
       { System.err.println("wrong input");
        System.exit(1);}
 if ("a,e,i,o,u,A,E,I,O,U".contains(vowel)) 
        System.err.println(vowel+" is vowel");
         else
        System.err.println(vowel+" is not vowel");         
        
    }
    
}

