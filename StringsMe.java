import java.util.Scanner;

public class StringsMe {

    public static void main(String[] args) {
        /**Method Description
  length()  Returns the number of characters in this string.
  charAt(index)  Returns the character at the specified index from this string.
  concat(s1)  Returns a new string that concatenates this string with string s1.
  toUpperCase()  Returns a new string with all letters in uppercase.
  toLowerCase()  Returns a new string with all letters in lowercase
  trim()  Returns a new string with whitespace characters trimmed on both sides. */
  String s1 = "Welcome to Java";
String s2 = "Programming is fun";
String s3 = "Welcome to Java";
System.err.println(s1.equals(s2));
System.out.println("1" + 1);
System.out.println('1' + 1);
System.out.println("1" + 1 + 1);
System.out.println("1" + (1 + 1));
System.out.println('l' + 1 + 1);
Scanner sc= new Scanner(System.in);
System.err.println("enter name and suename by space saperated");
String s = sc.nextLine();

int k =s.indexOf(" ");
String name=s.substring(0,k);
String Surname=s.substring(k+1);
System.err.println("your name "+name+" and surnem is "+Surname);


    }
    
}
