import java.util.Scanner;
public class DreamBank{


    private static void myPin(Scanner scanner){

        int pin = 1234;

    System.out.println("Enter your Pin");
    int pinn = scanner.nextInt();

    if(pin == pinn){
       myTransaction(scanner);
    }else{
        System.out.println("Invalid Pin");
        myPin(scanner);
    }

    
    }

    private static void myTransaction(Scanner scanner){

        Savings savings = new Savings();
        Current current = new Current();

        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance\n");

        System.out.println("Choose your Transaction");
        int tran = scanner.nextInt();

        if(tran == 1){
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
                  current.myCurrent(scanner);
                  break;

                case 3:
                  myTransaction(scanner);

                
            }

        }else if(tran == 2){
            System.out.println("Deposit\n");

            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Back");
        }else if(tran == 3){
            System.out.println("Check Balance\n");

            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Back");

        }else{
            System.out.println("Exit");
        }


    }
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
          
        myPin(scanner);

     
        scanner.close();
    }
}