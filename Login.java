
package quiz.application;
import javax.swing.*;//JFrame comes under this package
import java.awt.*;  //color classes present in aws package
import java.awt.event.*;


public class Login  extends JFrame implements ActionListener{//actionlistner interface comes under java.awt.event package which is used for click event like activation of button and rules section.
    
    JButton back ,rules; //globally declared
    JTextField tfname;
    Login(){ //constructor
        
        getContentPane().setBackground(Color.WHITE);// adding backgroundcolor
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));// adding image
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        
        JLabel heading = new JLabel("Simple Minds"); //for heading
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Poppins" ,Font.BOLD, 40));
        heading.setForeground(new Color(30, 144,254));
        add(heading);
        
        
        
        JLabel name=new JLabel("Enter your name");// entering name format
        name.setBounds(810, 150, 300,20);
        name.setFont(new Font("Mongolian Baiti" ,Font.BOLD,20));
        name.setForeground(new Color(30, 144,254));
        add(name);
        
        //text field for entering name
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,18));
        add(tfname);
        
        
       rules = new JButton("Rules");//for rules button
       rules.setBounds(735, 270, 120, 25);
       rules.setBackground(new Color(30, 144, 254));
       rules.setForeground(Color.WHITE);
       rules.addActionListener(this);  // for  performing click action
       add(rules);
       
       
       
       back = new JButton("Back");//for back button
       back.setBounds(915, 270, 120, 25);
       back.setBackground(new Color(30, 144, 254));
       back.setForeground(Color.WHITE);
       back.addActionListener(this); //for performing click action
       add(back);
       
        
        
        
        setSize(1200,500);//frame size
        setLocation(200, 200);// frame loction
        setVisible(true);// for visibility of frame
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
               
    }
        
    }
    
    public static void main(String[] args){
        new Login();
    }
}
