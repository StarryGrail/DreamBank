import java.util.ArrayList;
import java.util.Scanner;


public class Savings {
    
        void mySavings(){

        ArrayList<Double> savings = new ArrayList<Double>();

        savings.add(1000000.0);

    }

    void myWithdraw(Scanner scanner){

        ArrayList<Double> savings = new ArrayList<Double>();

       
        
        System.out.println("Enter the amount to Withdraw");
        double remove = scanner.nextDouble();

         savings.add(100000.0 - remove);

        System.out.println("You have  withdrawn " + remove);
         
        for(double dbl : savings)
           System.out.println("Your remaining balance: " + dbl);        
    }
}
