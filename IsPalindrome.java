import java.util.Scanner;

class IsPalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter a word to check palindrome or not");
        String s = sc.nextLine();
        int low=0;
        int high=s.length()-1;
        boolean p= true;
        while(low<high){
            if(s.charAt(low) !=s.charAt(high) )
             { p= false;
                break;
             }
             high--;
             low++;
        }
        if (p) {System.err.println(s+" is palendrome");
            
        } else {System.err.println(s+" is not a palendrome");
            
        }
    }
}