class One {
    public One(string s) {
    System.out.println( s + “ one” );
}
public class Two extends One {
public Two ( string s) {
super(s);
System.out.print ( s + “two”);
    }
    public static void main ( string a[]){
new Two (“message”);
System.out.println(“ “);
    }
}