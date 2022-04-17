import java.util.Scanner;
  
  public class GuessBirthday {
  public static void main(String[] args) {
  String set1 =
  " 1 3 5 7\n" +
  " 9 11 13 15\n" +
  "17 19 21 23\n" +
  "25 27 29 31";

 String set2 =
 " 2 3 6 7\n" +
 "10 11 14 15\n" +
 "18 19 22 23\n" +
 "26 27 30 31";

 String set3 =
 " 4 5 6 7\n" +
 "12 13 14 15\n" +
 "20 21 22 23\n"+
 "28 29 30 31";

 String set4 =" 8 9 10 11\n" +"12 13 14 15\n" +"24 25 26 27\n" +"28 29 30 31";

 String set5 =
 "16 17 18 19\n" +
 "20 21 22 23\n" +
 "24 25 26 27\n" +
 "28 29 30 31";
 Scanner sc =new Scanner (System.in);
 System.err.println("please ans for YES 1 nd for NO 0");
 System.err.println(set1);
 int day = 0;
 System.err.println("Is your birthday is in ");
    int a1 =sc.nextInt();
    if (a1==1)
        day+=1;
 System.err.println(set2);
        
        System.err.println("Is your birthday is in set2 ");
           int a2 =sc.nextInt();
           if (a2==1)
               day+=2;  
System.err.println("please ans for YES 1 nd for NO 0");
               System.err.println(set3);
               
 System.err.println("Is your birthday is in  set 3");
                  int a3 =sc.nextInt();
                  if (a3==1)
                      day+=4; 
 System.err.println("please ans for YES 1 nd for NO 0");
System.err.println(set4);

System.err.println("Is your birthday is in set 4 ");
    a1 =sc.nextInt();
   if (a1==1)
       day+=8; 
 System.err.println("please ans for YES 1 nd for NO 0");
System.err.println(set5);

System.err.println("Is your birthday is in set5 ");
    a1 =sc.nextInt();
   if (a1==1)
       day+=16;
System.err.println("your birthday is "+day);
}}
