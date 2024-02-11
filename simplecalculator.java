import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class simplecalculator extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton badd,bsub,bmul,bdiv;
    simplecalculator(){
        setSize(500,500);
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        t1=new JTextField(15);
        t2=new JTextField(15);
        badd=new JButton("+");
        bsub=new JButton("-");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        JPanel p=new JPanel();
        p.add(t1);
        p.add(t2);
        p.add(badd);
        p.add(bmul);
        p.add(bsub);
        p.add(bdiv);
        add(p);
        t1.addActionListener(this);
        t2.addActionListener(this);
        badd.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bsub.addActionListener(this);
    }public void actionPerformed(ActionEvent e){
        String s1=t1.getText();
        String s2=t2.getText();
        double eq=0;
        if(e.getSource()==badd){
            eq=Double.parseDouble(s1)+Double.parseDouble(s2);
        }else if(e.getSource()==bmul){
            eq=Double.parseDouble(s1)*Double.parseDouble(s2);
        }else if(e.getSource()==bsub){
            eq=Double.parseDouble(s1)-Double.parseDouble(s2);
        }else if(e.getSource()==bdiv){
            eq=Double.parseDouble(s1)/Double.parseDouble(s2);
        }t1.setText(Double.toString(eq));
        t2.setText(null);
    }public static void main(String[] args) {
        simplecalculator s=new simplecalculator();
        s.setVisible(true);
    }
}
