import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
            Account[] AccountArray = new Account[10];
        for (int i = 0; i < AccountArray.length; i++) {
        AccountArray[i] = new Account(i);
        } 
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter your ID");
        int id=sc.nextInt();
        if(id>10)
        {
            System.err.println("your have not exist");
            System.exit(1);
        }
        int i=0;
        while(i<=3){
            System.err.println("!! Main Menu !!");
            System.err.println("1.My balance");
            System.err.println("2.Deposit");
            System.err.println("3.Widrow");
            System.err.println("4.Exit means >=4");
             i=sc.nextInt();
             switch (i) {
                 case 1: AccountArray[id].getbalance();
                     
                         break;
                case 2: System.err.println("enter amount");
                         double bal =sc.nextDouble();
                         AccountArray[id].deposit(bal);
                        break; 
                case 3: System.err.println("enter amount");
                        double bala =sc.nextDouble();
                        AccountArray[id].withdraw(bala);
                       break;
                 default:
                     break;
             }


        }
    }
}
class Account{
    public int id;
    public double balance=100;
    Account(int i){
        id=++i;
    }
    public void getbalance(){
        System.err.println("your current bal is "+balance);
    }
    public void deposit(double b){
        balance+=b;
        System.err.println("your balance is updated "+balance);

    }
    public void withdraw(double w){
        if(w>balance)
            System.err.println("you have not suffient bal");
        else
           balance-=w;


    }
}
