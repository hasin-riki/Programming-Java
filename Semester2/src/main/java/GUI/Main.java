
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {
    JFrame frame;
    JTextField textfleid;
    JTextField textfleid2;
    JTextField textfleid3;
    JTextField textfleid4;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JButton button;
    JPanel panel;
    Font myFont = new Font("Impact",Font.BOLD,15);
    double a=0,b=0,c=0;
    Main(){
        frame=new JFrame("BMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        textfleid=new JTextField();
        textfleid.setBounds(50,50,100,30);
        textfleid.setFont(myFont);
        frame.add(textfleid);
        textfleid2=new JTextField();
        textfleid2.setBounds(50,150,100,30);
        textfleid2.setFont(myFont);
        frame.add(textfleid2);
        textfleid3=new JTextField();
        textfleid3.setBounds(50,150,100,30);
        textfleid3.setFont(myFont);
        frame.add(textfleid3);
        l1=new JLabel("BMI CALCILATOR");
        l1.setBounds(150,10,300,50);
        l2=new JLabel("ENTER YOUR HEIGHT IN INCHES");
        l2.setBounds(50,100,300,50);
        l3=new JLabel("ENTER YOUR WEIGHT IN");
        l3.setBounds(50,200,300,50);
        l4=new JLabel("YOUR BMI IS");
        l4.setBounds(50,300,300,50);
        button= new JButton();
        button.setBounds(250,250,70,30);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(button);
        button.addActionListener(this);
            
        frame.setVisible(true);
       frame.add(l5);
        
    }
    public static void main(String[] args) {
    Main bmi=new Main();
    }
    @Override
            public void actionPerformed(ActionEvent e) {
                
                try{Integer input= Integer.parseInt(textfleid.getText());
              l5.setText(String.valueOf(input));
                
                }
            catch(Exception f){System.out.println(f);}
                 
            } 
}
