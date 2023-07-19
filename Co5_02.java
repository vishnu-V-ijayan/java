import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Co5_02 extends Applet implements ActionListener {
    TextField txt1,txt2,txt3,txt4;
    Button b;
    public void init(){
        txt1 = new TextField(5);
        txt2 = new TextField(5);
        txt3 = new TextField(5);
        txt4 = new TextField(5);
        b = new Button(" Maximum Number ");
         b.setBounds(400,300,300,90);
		  
        add(txt1);
        add(txt2);
        add(txt3);
        add(txt4);
        
        add(b);
        b.addActionListener(this);
    }

    
    public void actionPerformed(ActionEvent e){
        int num1, num2,num3,total;
        num1= Integer.parseInt(txt1.getText());
        num2= Integer.parseInt(txt2.getText());
        num3= Integer.parseInt(txt3.getText());
        
        total=(num1+num2+num3);
        txt4.setText(String.valueOf(total));
		if(num1<num2)
         {
if(num2<num3)
txt4.setText(""+num3);
else
txt4.setText(""+num2);
         }
else
txt4.setText(""+num1);
   }
}
