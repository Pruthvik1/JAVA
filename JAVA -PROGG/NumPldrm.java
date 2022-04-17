import java.util.Scanner;
public class NumPldrm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a num tp check palendrome");
        String  w = sc.nextLine() ;
        boolean ans = ispdm(reverse(w), w);
        if (ans) {
              System.err.println("yes");
        } else {
            System.err.println("no");
        }

}
public static String reverse(String w) {
    String rev="";
    int i=w.length()-1;
    while (i>=0) {
        rev= rev +  w.charAt(i) ;
        i--;
        
    }
    return rev;
}
public static boolean ispdm(String w, String rev){
    if (rev.equals(w)) {
        return true;
        
    } else {
        return false;
        
    }
}

}