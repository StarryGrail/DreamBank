import java.util.Scanner;

public class Pin {

    public static void myPin(Scanner scanner){
 
        int pin = 1234;

    System.out.println("Enter your Pin");
    int pinn = scanner.nextInt();

    if(pin == pinn){
       Transaction.myTransaction(scanner);
    }else{
        System.out.println("Invalid Pin");
        myPin(scanner);
    }

    
    }
    
}
