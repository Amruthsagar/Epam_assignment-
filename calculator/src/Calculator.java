import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Calculator
{
	static double addition(double a,double b)
	{
		return a+b;
	}
	static double subtraction(double a,double b)
	{
		return a-b;
	}
	static double multiplication(double a,double b)
	{
		return a*b;
	}
	static double division(double a,double b)
	{
		return a/b;
	}
	static long modular_division(double a,double b)
	{
		return (long)a%(long)b ;
	}
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char choice='y';
		double a,b;
		while(choice!='n' && choice!='N')
		{
			System.out.println("Select an operation to perform : ");
			System.out.println("\t1) Addition\n\t2) Subtraction\n\t3) Multiplication\n\t4) Division\n\t5) Modular division\n");
			System.out.print("Enter the operation number : ");
			int operation=Integer.parseInt(br.readLine());
			if(operation <0 || operation>5)
			{
				System.out.println("Wrong option selected");
				continue;
			}
			System.out.print("\nEnter the two operands\n\tA : ");
			a=Double.parseDouble(br.readLine());
			System.out.print("\tB : ");
			b=Double.parseDouble(br.readLine());
			switch(operation)
			{
			case 1:System.out.println(a+" + "+b+" = "+addition(a,b)); 
				   break;
			case 2:System.out.println(a+" - "+b+" = "+subtraction(a,b)); 
			       break;
			case 3:System.out.println(a+" * "+b+" = "+multiplication(a,b)); 
			       break;
			case 4:System.out.println(a+" / "+b+" = "+division(a,b)); 
			       break;
			case 5:System.out.println(a+" % "+b+" = "+modular_division(a,b)); 
			       break;
			}
			System.out.println("Do you want to continue? (y/n) :");
			choice=br.readLine().charAt(0);
		}
	}
}