import java.util.ArrayList;
import java.util.Scanner;


public class Savings {
    
        void mySavings(Scanner scanner){

        ArrayList<Double> savings = new ArrayList<Double>();

        savings.add(1000000.0);

         for(double bal : savings)
          System.out.println(" Current Balance " + bal);

       System.out.println("1. Back");
       int back = scanner.nextInt();

       switch(back){

        case 1:
          Transaction.myBalance(scanner);
          break;
       }
          

    }

       void myWithdraw(Scanner scanner){

        

        ArrayList<Double> savings = new ArrayList<Double>();

       System.out.println("1. Withdraw");
       System.out.println("2. Back\n");

       System.out.println("Press ");
       int press = scanner.nextInt();

       switch(press){

         case 1: 

           System.out.println("Enter the amount to Withdraw");
           double remove = scanner.nextDouble();

           savings.add(100000.0 - remove);
        
          System.out.println("Amount Withdrawn:  " + remove);

          for(double dbl : savings)
           System.out.println("Your remaining balance: " + dbl);  
           break; 
           
         case 2: 
           Transaction.myWithdraws(scanner);
             break;


       }
    }

        void myDepositS(Scanner scanner){

            ArrayList<Double> depositS = new ArrayList<Double>();
          
       System.out.println("Enter the amount to deposit");
       double depo = scanner.nextDouble();
        
            depositS.add(100000.0 + depo);

        System.out.println("Amount Deposit: " + depo);
        for(double dou : depositS)
         System.out.println("Remaining Balance: " + dou);

        
    }
}
