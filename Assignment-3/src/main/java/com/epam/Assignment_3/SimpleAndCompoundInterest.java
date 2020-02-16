package com.epam.Assignment_3;

/**
 * Hello world!
 *
 */
public class SimpleAndCompoundInterest 
{
    public double simple_interest(double principal_amount,double time_in_years,double rate_of_interest_inPercentage)
    {
    	return (principal_amount*time_in_years*rate_of_interest_inPercentage)/100;
    }
    public double compound_interest(double principal_amount,double time_in_years,double rate_of_interest_inPercentage)
    {
    	return principal_amount*Math.pow((1+(rate_of_interest_inPercentage)/100),time_in_years)-principal_amount;
    }
}
