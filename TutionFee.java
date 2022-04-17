import javax.sound.midi.SysexMessage;

public class TutionFee {
    public static void main(String[] args) {
        System.err.println("One year tution fee is 5000$");
        int year=1;
        long fee=5000;
        int i=0;
       
/**                     5000
                        5000+0.05*5000
                        5000+2(0.05*5000)
 */
while(year!=11){
            
            fee=fee+(long)(i*(0.05*5000));
            System.err.println(fee+" "+i+" y"+year);
            year++;
            i++;
        }
        System.err.println("fe is "+fee+"$");
    }
    
}
