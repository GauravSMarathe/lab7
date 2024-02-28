package fundamentals;

import java.util.Scanner;

public class TaxCalculator {

	public static double calculate_tax(boolean isIndian,String empName,double empSal) throws Exception,NullPointerException,ArithmeticException {
	Scanner sc=new Scanner(System.in);
	double taxAmount = 0;

	  if (!isIndian) {
          throw new Exception("The employee should be an Indian citizen for calculating tax");
      }

      if (empName == null || empName.isEmpty()) {
          throw new NullPointerException("The employee name cannot be empty");
      }
		if(empSal>=100000 && isIndian==true) {
			taxAmount=empSal*8/100;
			System.out.println("tax ammount="+taxAmount);
		}
		else if(empSal>=50000 && empSal<100000 && isIndian==true) {
			taxAmount=empSal*6/100;
			System.out.println("tax ammount="+taxAmount);
		}
		else if(empSal>=30000 && empSal<50000 && isIndian==true) {
			taxAmount=empSal*5/100;
			System.out.println("tax ammount="+taxAmount);
		}
		else if(empSal>=10000 && empSal<30000 && isIndian==true) {
			taxAmount=empSal*4/100;
			System.out.println("tax ammount="+taxAmount);
		}
		else {
			throw new ArithmeticException("salarry less than 10k");
		}
	return taxAmount;
	}
	
	public static void main(String[] args)  {
	
		try {
		double taxAmount1=calculate_tax(true,"raju", 100000);
	//	calculate_tax(true,"aaaju", 1000);
		double taxAmount2=calculate_tax(true,"", 100000);
		calculate_tax(false,"raju", 100000);
	}
		catch(NullPointerException ar) {
			System.out.println("the value is null");
			ar.printStackTrace();
		}
		catch(ArithmeticException ae) {
			System.out.println("Salary is less than 10k");
			ae.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("country is not valid ");
			e.printStackTrace();
		}	
}
}