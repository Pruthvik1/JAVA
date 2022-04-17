import java.util.Scanner;
public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size= sc.nextInt();
        int[] nums=new int[size];
        System.err.println("enter elements one by one");
        
       double sum=0;
        for( int i : nums) {
            nums[i]=sc.nextInt();
            
            sum= sum+(double) nums[i];
            
        }
        float avg =(float)(sum/(double)size);
        System.err.println("sum and avg is "+sum+" "+avg);


    }
    
}
