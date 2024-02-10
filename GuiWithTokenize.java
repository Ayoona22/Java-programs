import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
 class GuiWithTokenize extends JFrame implements ActionListener {
    JTextField t1,t2;
    JButton b;
    GuiWithTokenize(){
        setTitle("No. of integers");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("Read");
        JPanel p=new JPanel(new FlowLayout());
        p.add(t1);
        p.add(b);
        p.add(t2);
        t1.addActionListener(this);
        b.addActionListener(this);
        t2.addActionListener(this);
        t2.setEditable(false);
        add(p);
    }public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            String str=t1.getText();
            StringTokenizer st=new StringTokenizer(str);
            int count=st.countTokens();
            t2.setText(Integer.toString(count));
        }
    }
    public static void main(String[] args) {
        GuiWithTokenize g=new GuiWithTokenize();
        g.setVisible(true);
    }
}
