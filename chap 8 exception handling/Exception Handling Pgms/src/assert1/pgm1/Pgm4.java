package assert1.pgm1;

import java.util.Scanner;

public class Pgm4 
{
	int num,den,res;
	Scanner sc=new Scanner(System.in);
	
	public void divide()
	{
		System.out.println("\n Enter the numerator");
		num=sc.nextInt();
		
		System.out.println("\n Enter the denominator");
		den=sc.nextInt();
		
		assert(den!=0):"\nDenominator can never be 0";
		/*
		 * suppose the assert keyword is not enabled at runtime, then the above assert condition
		 * den!=0 is not checked at runtime. So in that case even if the den variable value is 0,
		 * but because the assert keyword is not enabled at runtime so the condition den!=0
		 * is not checked at runtime. 
		 * So no java.lang.AssertionError will be generated at runtime and instead control
		 * goes to next statement int res=num/den but because value of denominator was 0
		 * so the statement int res=num/den will generate a java.lang.ArithmeticException which being an
		 * exception can be caught and handled.
		 * 
		 * suppose the assert keyword is enabled at runtime, then the above assert condition
		 * den!=0 is checked at runtime. So in that case if the den variable value is 0,
		 * so the condition den!=0 is checked at runtime and so because it will be false so 
		 * java.lang.AssertionError will be generated at runtime and pgm execution will be abruptly terminated.
		 * 
		 * 
		 * How to enable assert keyword in java pgm in eclipse:
		 * right click in pgm window->Run As-> Open run configurations->Double click on Java Application->
		 * go to Arguments tab-> in the VM i.e. Virtual machine arguments text area type -ea or
		 * -enableassertions
		 * 
		 * 
		 */
		res=num/den;
		
		System.out.println("\n The result of division between "+num+" and "+den+" is "+res);
		
		
	}
}
