import java.util.Scanner;

public class Transaction {

     public static void myTransaction(Scanner scanner){

        Savings savings = new Savings();
        Current current = new Current();

        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance\n");

        System.out.println("Choose your Transaction");
        int tran = scanner.nextInt();

        if(tran == 1){
           myWithdraws(scanner);

        }else if(tran == 2){
            myDeposit(scanner);
            
        }else if(tran == 3){
            System.out.println("Check Balance\n");

            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Back");

            System.out.println("Choose your Account: ");
            int choose = scanner.nextInt();

            switch(choose){

                case 1:
                 savings.mySavings(scanner);
                 break;

                case 2:
                 current.myCurrent(scanner);

                case 3:
                 break;

            }

        }else{
            System.out.println("Exit");
        }


    }

    public static void myWithdraws(Scanner scanner){

        Savings savings = new Savings();
        Current current = new Current();

           System.out.println("Withdraw\n");

           System.out.println("1. Savings Account");
           System.out.println("2. Current Account");
           System.out.println("3. Back\n");
    
           System.out.println("Choose your Account");
           int with = scanner.nextInt();

           switch(with){

               case 1: 
                 savings.myWithdraw(scanner);
                 break;

               case 2:
                 current.myWithdraw(scanner);
                 break;

               case 3:
                 myTransaction(scanner);

               
           }
    }

    public static void myDeposit(Scanner scanner){

        Savings savings = new Savings();
        Current current = new Current();

           System.out.println("Deposit\n");

           System.out.println("1. Savings Account");
           System.out.println("2. Current Account");
           System.out.println("3. Back");

           System.out.println("Choose your Account");
           int acc = scanner.nextInt();

           switch(acc){

               case 1: 
                savings.myDepositS(scanner);
               break;

               case 2:
                current.myDepositC(scanner);
                break; 

               case 3:
                myTransaction(scanner);

                
           }

    }

    public static void myBalance(Scanner scanner){

          Savings savings = new Savings();
          Current current = new Current();

          System.out.println("Check Balance\n");

           System.out.println("1. Savings Account");
           System.out.println("2. Current Account");
           System.out.println("3. Back");

           System.out.println("Choose your Account: ");
           int choose = scanner.nextInt();

           switch(choose){

               case 1:
                savings.mySavings(scanner);
                break;

               case 2:
                current.myCurrent(scanner);

               case 3:
               myTransaction(scanner);
                break;

           }


    }
    
}
