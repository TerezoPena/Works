
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test{

    private JFrame f =new JFrame("Test Frame");;
    private JPanel p = new JPanel(new GridBagLayout());
    private JButton b1 = new JButton("Button Test");
    private JButton b2 = new JButton("Button Test-1");
    private JLabel lab = new JLabel("Label Test");
    private JComboBox cbox = new JComboBox<String>();
    private GridBagConstraints c = new GridBagConstraints();
    private JTextField jt = new JTextField("    Enter Family    ");
    

    public void spaceboxes(int one, int two,int three,int four){
        c.insets = new Insets(one,two,three,four);
        
    }
    public void setAxis(int y,int x){
        c.gridx=0;
        c.gridy=2;
    }
    public void gui(){
         
        f.setVisible(true);
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p.setBackground(Color.BLUE);
        
        spaceboxes(10, 10, 10, 10);
       p.add(cbox,c);
       p.add(b1,c);
       spaceboxes(40, 40, 40, 40);
       
       p.add(jt,c);
        p.add(b2);
        spaceboxes(10, 10, 10, 10);
        p.add(lab,c);
         
        //f.add(p,BorderLayout.West);
        f.add(p);
    }

    public Test(){
        
        gui();
        
        b1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
               System.out.println("Click");
               
            }

        });
        jt.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
               String input = jt.getText();
               cbox.addItem(input);
            }

        });
    
    }
    public static void main(String[] args){
        System.out.print("Test");
        new Test();
    }
}