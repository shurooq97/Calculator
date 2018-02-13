

public class CalculatorModel  { // Holds the value of the sum of the numbers

// entered in the view


private static double calculationValue;
 
public static double addTwoNumbers(double firstNumber, double secondNumber){

	return  firstNumber + secondNumber;
   // calculationValue = firstNumber + secondNumber;

}
public static double subTwoNumbers(double firstNumber, double secondNumber){

    calculationValue = firstNumber - secondNumber;
    return  calculationValue;    

}
public  static double multTwoNumbers(double firstNumber, double secondNumber){

    calculationValue = firstNumber*secondNumber;
   return  calculationValue;

}
public  static double divTwoNumbers(double firstNumber, double secondNumber){

   // calculationValue = firstNumber/secondNumber;
 //   return calculationValue;
return firstNumber/secondNumber;
}
public  static double modTwoNumbers(double firstNumber, double secondNumber){

    calculationValue = firstNumber%secondNumber;
    return  calculationValue;

}
public  static  double sqr(double num){
	

    calculationValue = Math.sqrt(num);
    return  calculationValue;
	
}
public static int add(int n1,int n2){
	return n1+n2;
}
public String back(String s){
	
	int length=s.length();
	int num=length-1;
	String st="";
	if(length>0){
		StringBuilder st1=new StringBuilder(s);
		st1.deleteCharAt(num);
		st=st1.toString();
		
	}
	return st;
}


public static double getCalculationValue(){

    return calculationValue;
}



}
