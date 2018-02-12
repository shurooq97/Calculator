
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

	
	
	JTextField result = new JTextField();
	
	
	JLabel label = new JLabel("");
	

	
	JButton button1 = new JButton("1");
	


	
	JButton button9 = new JButton("9");
	
	
	JButton button8 = new JButton("8");
	
	
	JButton button5 = new JButton("5");
	
	JButton button6 = new JButton("6");
	

	JButton button2 = new JButton("2");
	JButton button7 = new JButton("7");
	JButton button4 = new JButton("4");
	JButton button3 = new JButton("3");

	JButton button0 = new JButton("0");
	
	
	JButton buttonadd = new JButton("+");
	JButton buttonsub = new JButton("-");

	JButton buttonmul = new JButton("*");
	JButton buttonsqr = new JButton("sq");

	JButton buttondiv = new JButton("/");
	
	JButton buttonequal = new JButton("=");
	
	JButton buttondot = new JButton(".");

	
	JButton button = new JButton("<-");

	JButton buttonmod = new JButton("%");
	JButton btnClear = new JButton("clear");

	

	double num=0.0;
	double ans;
	CalculatorView(){
		this.getContentPane().setBackground(new Color(105, 105, 105));
		this.setBackground(SystemColor.controlShadow);
		this.setBounds(100, 100, 483, 341);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setTitle("Calculator");
		button9.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button9.setBackground(SystemColor.controlShadow);
		button9.setBounds(209, 206, 54, 35);
		
		button8.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button8.setBackground(SystemColor.controlShadow);
		button8.setBounds(157, 206, 54, 35);
		
		button1.setBackground(SystemColor.controlShadow);
		button1.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button1.setBounds(105, 110, 54, 35);
		
		button6.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button6.setBackground(SystemColor.controlShadow);
		button6.setBounds(209, 158, 54, 35);
		
		
		button2.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button2.setBackground(SystemColor.controlShadow);
		button2.setBounds(157, 110, 54, 35);
		
		button7.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button7.setBackground(SystemColor.controlShadow);
		button7.setBounds(105, 206, 54, 35);
		
		button5.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button5.setBackground(SystemColor.controlShadow);
		button5.setBounds(157, 158, 54, 35);

		
		button4.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button4.setBackground(SystemColor.controlShadow);
		button4.setBounds(105, 158, 54, 35);
		
		button0.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button0.setBackground(SystemColor.controlShadow);
		button0.setBounds(157, 254, 54, 35);
		
		button3.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
button3.setBackground(SystemColor.controlShadow);
button3.setBounds(209, 110, 54, 35);

		
		buttonsub.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		buttonsub.setBackground(SystemColor.controlShadow);
		buttonsub.setBounds(260, 158, 54, 35);
		
		buttonmul.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		buttonmul.setBackground(SystemColor.controlShadow);
		buttonmul.setBounds(260, 206, 54, 35);

		buttonsqr.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		buttonsqr.setBackground(SystemColor.controlShadow);
		buttonsqr.setBounds(312, 206, 54, 35);
		
		buttondiv.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		buttondiv.setBackground(SystemColor.controlShadow);
		buttondiv.setBounds(312, 158, 54, 35);
		
		buttonadd.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		buttonadd.setBackground(SystemColor.controlShadow);
		buttonadd.setBounds(260, 110, 54, 35);
		
		
		buttonmod.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
	buttonmod.setBackground(SystemColor.controlShadow);
	buttonmod.setBounds(312, 110, 54, 35);
	
		buttonequal.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		buttonequal.setBackground(SystemColor.controlShadow);
		buttonequal.setBounds(209, 254, 54, 35);
		result.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		result.setBounds(114, 36, 200, 35);
		
		result.setColumns(10);
		
		buttondot.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		buttondot.setBackground(SystemColor.controlShadow);
		buttondot.setBounds(105, 254, 54, 35);
		
		btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnClear.setBackground(SystemColor.controlShadow);
		btnClear.setBounds(260, 254, 106, 35);
		button.setForeground(Color.WHITE);
		
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		button.setBackground(new Color(100, 149, 237));
		button.setBounds(312, 35, 54, 36);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		label.setForeground(new Color(128, 0, 0));
		label.setBounds(236, 7, 78, 16);
		this.getContentPane().add(button9);

		this.getContentPane().add(button5);
		this.getContentPane().add(button1);
		this.getContentPane().add(button8);
		this.getContentPane().add(button2);
		this.getContentPane().add(button6);
		this.getContentPane().add(button4);
		this.getContentPane().add(buttonmul);
		this.getContentPane().add(buttonadd);
		this.getContentPane().add(btnClear);
		this.getContentPane().add(label);
		this.getContentPane().add(result);
		this.getContentPane().add(button);
		this.getContentPane().add(buttonequal);
		this.getContentPane().add(buttondot);
		this.getContentPane().add(buttonmod);
		this.getContentPane().add(buttondiv);// Sets up the view and adds the components
		this.getContentPane().add(buttonsqr);
		this.getContentPane().add(button0);
		this.getContentPane().add(button3);
		this.getContentPane().add(buttonsub);
		this.getContentPane().add(button7);
		// End of setting up the components --------
		
	}

	
	public double getresult(){
		
		return Double.parseDouble(result.getText());
		
	}
	
public String gettextresult(){
		
		return(result.getText());
		
	}
	
	
	
	public void setresult(String solution){
		
		result.setText(solution);
		
	}
	
	public void setTexttoLabel(String st){
		label.setText(st);
	}
	public void clearLabel(){
		label.setText(" ");
	}
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addListener0(ActionListener l){
		
		button0.addActionListener(l);
		
	}
void addListener1(ActionListener l){
		
		button1.addActionListener(l);
		
	}
void addListener2(ActionListener l){
	
	button2.addActionListener(l);
	
}
void addListener3(ActionListener l){
	
	button3.addActionListener(l);
	
}
void addListener4(ActionListener l){
	
	button4.addActionListener(l);
	
}
void addListener5(ActionListener l){
	
	button5.addActionListener(l);
	
}
void addListener6(ActionListener l){
	
	button6.addActionListener(l);
	
}
void addListener7(ActionListener l){
	
	button7.addActionListener(l);
	
}
void addListener8(ActionListener l){
	
	button8.addActionListener(l);
	
}
void addListener9(ActionListener l){
	
	button9.addActionListener(l);
	
}
void addaddListener(ActionListener l){
	
	buttonadd.addActionListener(l);
	
}
void addsubListener(ActionListener l){
	
	buttonsub.addActionListener(l);
	
}
void addmulListener(ActionListener l){
	
	buttonmul.addActionListener(l);
	
}
void adddivListener(ActionListener l){
	
	buttondiv.addActionListener(l);
	
}
void addmodListener(ActionListener l){
	
	buttonmod.addActionListener(l);
	
}
void addsqrListener(ActionListener l){
	
	buttonsqr.addActionListener(l);
	
}
void adddotListener(ActionListener l){
	
	buttondot.addActionListener(l);
	
}
void addbutListener(ActionListener l){
	
	button.addActionListener(l);
	
}
void addclearListener(ActionListener l){
	
	btnClear.addActionListener(l);
	
}
void addequalListener(ActionListener l){
	
	buttonequal.addActionListener(l);
	
}
// Open a popup that contains the error message passed
	
	void displayErrorMessage(){
		
		result.setText("Error");
		
	}
	
}