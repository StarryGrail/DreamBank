import java.util.Scanner;
import java.util.ArrayList;
public class Current {
    
       void myCurrent(Scanner scanner){

        ArrayList<Double> current = new ArrayList<Double>();
     
         current.add(100000.0);

    }

    void myWithdraw(Scanner scanner){

        ArrayList<Double> check = new ArrayList<Double>();

        

        System.out.println("Enter the amount");
        double draw = scanner.nextDouble();

        check.add(100000.0 - draw);
        
        System.out.println("You have withdrawn " + draw);

        for(double chk : check)
        System.out.println("Your remaining balance" + chk);


    }
}
