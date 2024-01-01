import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class DreamBank implements ActionListener{

     JFrame window = new JFrame("SDB");
     JLabel background;
    private int  button ;//= new JButton("Continue");

    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    
     JFrame window = new JFrame("SDB");
     JLabel background;
     JButton button = new JButton("Continue");

     //ImageIcon icon = new ImageIcon("SDB.png");
     window.setLayout(new BorderLayout(10,10));
     window.setSize(900,600);
     //window.add(new JLabel("Press to continue"));
     button.setSize(40,50);
     button.addActionListener(new button(1));
     window.add(button);
     
     ImageIcon bank = new ImageIcon("Dream.png");
     background = new JLabel("",bank,JLabel.CENTER);
     //JLabel background.setBounds(0,0,900,700);
     window.add(background);
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     window.setLocationRelativeTo(null);
     window.setVisible(true);




        Pin.myPin(scanner);
         
        scanner.close();
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){

         gui Gui = new gui();

         //Gui.myMethod();
       

       }
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }



    
}