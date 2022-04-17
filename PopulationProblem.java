import java.util.Scanner;

public class PopulationProblem {
    public static void main(String[] args) {
        /***1.11 (Population projection) The U.S. Census Bureau projects population based on the 
            following assumptions:
            ■ One birth every 7 seconds
            ■ One death every 13 seconds
            ■ One new immigrant every 45 seconds
            Write a program to display the population for each of the next five years. Assume the 
            current population is 312,032,486 and one year has 365 days. Hint: In Java, if two 
            integers perform division, the result is an integer. The fractional part is truncated. For 
            example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with 
            the fractional part, one of the values involved in the division must be a number with a 
            decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5. */
            Scanner sc= new Scanner(System.in);
            System.out.println("enter no of gap 5 year");
        
            int y = sc.nextInt();
             double cp= 312032486.0;
            int year= y*5;
           double b =(60.0*60.0*24.0*365.0)/7;
            double d=(60.0*60.0*24.0*365.0)/13;
            double i=(60.0*60.0*24.0*365.0)/45;
            double gap=(double)year*(b - d + i);
            double ans =cp+gap;
            System.out.println("population is  "+ ans);





    }
    
}
