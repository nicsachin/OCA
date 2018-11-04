
  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class Exam extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    Exam(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);

        }  
        b1=new JButton("Next Question...");  
        b1.addActionListener(this);  
        add(b1);
         
        set();  
        l.setBounds(30,40,480,20);  
        jb[0].setBounds(50,80,400,20);  
        jb[1].setBounds(50,110,400,20);  
        jb[2].setBounds(50,140,400,20);  
        jb[3].setBounds(50,170,400,20);  
        b1.setBounds(150,240,180,30);  
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                 
                b1.setText("Result");  
            }  
        }  
 
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
           
            JOptionPane.showMessageDialog(this,"you had scored  100"+" %");  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
       // jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("1. What is the stored in the object obj in following lines of code? Box obj;");  
            jb[0].setText("Memory address of allocated memory of object");jb[1].setText("NULL");jb[2].setText(" Any arbitrary pointer");jb[3].setText("Garbage");   
        }  
        if(current==1)  
        {  
            l.setText("2. Which of these keywords is used to make a class?");  
            jb[0].setText("class");jb[1].setText("struct");jb[2].setText("int");jb[3].setText("none of these");  
        }  
        if(current==2)  
        {  
            l.setText("4. Which of these operators is used to allocate memory for an object?");  
            jb[0].setText("malloc");jb[1].setText("alloc");jb[2].setText("new");jb[3].setText("give");  
        }  
        if(current==3)  
        {  
            l.setText("5. Which of these statement is incorrect?");  
            jb[0].setText(" Every class must contain a main() method");jb[1].setText("Applets do not require a main() method at all");jb[2].setText("There can be only one main() method in a program");jb[3].setText("main() method must be made public");  
        }  
        if(current==4)  
        {  
            l.setText("6. Which of the following is not OOPS concept in Java?");  
            jb[0].setText(" Inheritance");jb[1].setText("Encapsulation");jb[2].setText("Polymorphism");jb[3].setText("Compilation");  
        }  
        if(current==5)  
        {  
            l.setText("7. When does method overloading is determined?");  
            jb[0].setText("At run time");jb[1].setText("At compile time");jb[2].setText("At coding time");jb[3].setText("At execution time");  
        }  
        if(current==6)  
        {  
            l.setText("8. Which one among these is not a class? ");  
            jb[0].setText("Swing");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");  
                        jb[3].setText("Button");  
        }  
        if(current==7)  
        {  
            l.setText("Que8: which one among these is not a function of Object class?");  
            jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");  
                        jb[3].setText("getDocumentBase");         
        }  
        if(current==8)  
        {  
            l.setText("Que9: which function is not present in Applet class?");  
            jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");  
        }  
        if(current==9)  
        {  
            l.setText("10.Which of the data type value is returned by equals()method of String class?");  
            jb[0].setText("char");jb[1].setText("int");jb[2].setText("boolean");  
                        jb[3].setText("double");  
        }  
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[1].isSelected());  
        if(current==1)  
            return(jb[0].isSelected());  
        if(current==2)  
            return(jb[2].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[3].isSelected());  
        if(current==5)  
            return(jb[1].isSelected());  
        if(current==6)  
            return(jb[1].isSelected());  
        if(current==7)  
            return(jb[3].isSelected());  
        if(current==8)  
            return(jb[1].isSelected());  
        if(current==9)  
            return(jb[2].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  
        new Exam("oracle certification exam");  
    }  
} 