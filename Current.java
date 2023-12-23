import java.util.Scanner;
import java.util.ArrayList;
public class Current {
    
       void myCurrent(Scanner scanner){

        ArrayList<Double> current = new ArrayList<Double>();
     
         current.add(100000.0);

         for(double bal : current)
          System.out.println(" Current Balance: " + bal);

          System.out.println("1. Back");
          int back = scanner.nextInt();
   
          switch(back){
   
           case 1:
             DreamBank.myBalance(scanner);
             break;
          }

    }

    void myWithdraw(Scanner scanner){

        ArrayList<Double> check = new ArrayList<Double>();

          System.out.println("Enter the amount");
          double draw = scanner.nextDouble();

          check.add(100000.0 - draw);
        
          System.out.println("You have withdrawn " + draw);

          for(double chk : check)
            System.out.println("Your remaining balance " + chk);


    }

    void myDepositC(Scanner scanner){

        ArrayList<Double> checks = new ArrayList<Double>();

        System.out.println("Enter the amount to deposit");
        double depo = scanner.nextDouble();
         
             checks.add(100000.0 + depo);
 
         System.out.println("Amount Deposit: " + depo);
         for(double dou : checks)
          System.out.println("Remaining Balance: " + dou);


    }
}
