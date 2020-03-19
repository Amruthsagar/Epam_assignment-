package com.epam.SingletonPatternDemo;

public class SingletonCalc
{
	private static SingletonCalc cal ;
	private SingletonCalc() {};
	public static SingletonCalc getInstance()
	{
		if(cal==null)
			cal = new SingletonCalc();
		return cal;
	}
	public int addition(int a,int b)
	{
		return a+b;
	}
	public  int subtraction(int a,int b)
	{
		return a-b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int division(int a,int b)
	{
		return a/b;
	}
}