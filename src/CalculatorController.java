

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	double num1,num2,res;
	int operation;
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.addListener0(new l0());
		this.theView.addListener1(new l1());
		this.theView.addListener2(new l2());
		this.theView.addListener3(new l3());
		this.theView.addListener4(new l4());
		this.theView.addListener5(new l5());
		this.theView.addListener6(new l6());
		this.theView.addListener7(new l7());
		this.theView.addListener8(new l8());
		this.theView.addListener9(new l9());
		this.theView.addaddListener(new add());
		this.theView.addsubListener(new sub());
		this.theView.adddivListener(new div());
		this.theView.addmulListener(new mul());
		this.theView.addmodListener(new mod());
		this.theView.adddotListener(new dot());
		this.theView.addbutListener(new btn());
		this.theView.addequalListener(new equal());
		this.theView.addclearListener(new clear());
		this.theView.addsqrListener(new sqr());
	}
	
	class l0 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String s= theView.gettextresult();
		   
			theView.setresult(s+"0");
		
			
		}
	}
		class l1 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"1");
			
				
			}
		}
		class l2 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"2");
			
				
			}
		}
		class l3 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"3");
			
				
			}
		}
		class l4 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"4");
			
				
			}
		}
		class l5 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"5");
			
				
			}
		}
		class l6 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"6");
			
				
			}
		}
		class l7 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"7");
			
				
			}
		}
		class l8 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"8");
			
				
			}
		}
		class l9 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+"9");
			
				
			}
		}
		class dot implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				String s= theView.gettextresult();
			   
				theView.setresult(s+".");
			
				
			}
		}
		class add implements ActionListener{

			public void actionPerformed(ActionEvent e) {
			try{	num1 = theView.getresult();
				theView.setresult("");
				theView.setTexttoLabel(num1+"+");
				operation=1;
			}catch(NumberFormatException ex){ theView.displayErrorMessage(); 
			
		}
		}}
		class sub implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				try{
				if( theView.gettextresult().equals("")){
					theView.setresult("-");
				}
				else{
				num1 = theView.getresult();
				theView.setresult("");
				theView.setTexttoLabel(num1+"-");
				operation=2;
				}
			}catch(NumberFormatException ex){ theView.displayErrorMessage(); 
			
		}
		}
		}
		class mul implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				try{num1 = theView.getresult();
				theView.setresult("");
				theView.setTexttoLabel(num1+"*");
				operation=3;}
			catch(NumberFormatException ex){ theView.displayErrorMessage(); 
			
			}
			}
		}
		class div implements ActionListener{

			public void actionPerformed(ActionEvent e) {
			try{	num1 = theView.getresult();
				theView.setresult("");
				theView.setTexttoLabel(num1+"/");
				operation=4;
			}catch(NumberFormatException ex){ theView.displayErrorMessage(); 
				
			}
			}
		}
		class mod implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				try{num1 = theView.getresult();
				theView.setresult("");
				theView.setTexttoLabel(num1+"%");
				operation=5;}
				catch(NumberFormatException ex){ 
					theView.displayErrorMessage(); 
				
			}
			}
		}
		class btn implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				theView.setresult(	theModel.back(theView.gettextresult()));
			}
		}
		class clear implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				theView.setresult("");
			}
		}
		class sqr implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				try{
				num1=theView.getresult();
				theModel.sqr(num1);
				res=theModel.getCalculationValue();
				theView.setresult(res+"");
				
			}
				catch(NumberFormatException ex){  theView.displayErrorMessage();    }
		
		
		}
		}
		class equal implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				switch (operation) {
				case 1:
				num2=theView.getresult();
				
					res=	theModel.addTwoNumbers(num1, num2);
					//	res=theModel.getCalculationValue();
						theView.setresult(res+"");
					break;
					
				case 2:
					num2=theView.getresult();
					
					theModel.subTwoNumbers(num1, num2);
					res=theModel.getCalculationValue();
					theView.setresult(res+"");
					
					break;
					
				case 3:
					num2=theView.getresult();
					
					res=theModel.multTwoNumbers(num1, num2);
					
					theView.setresult(res+"");
					break;
					
				case 4:
					num2=theView.getresult();
					res =theModel.divTwoNumbers((int)num1, (int)num2);
				
					theView.setresult(res+"");
					break;
				case 5:
					num2=theView.getresult();
					
					theModel.modTwoNumbers(num1, num2);
					res=theModel.getCalculationValue();
					theView.setresult(res+"");
					break;
			}//end switch
				theView.clearLabel();
		}
		
		}

}
	

