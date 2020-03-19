package com.epam.SingletonPatternDemo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.epam.SingletonPatternDemo.SingletonCalc;;

public class SingletonCalcTest 
{
	SingletonCalc c = SingletonCalc.getInstance();
    @Test
    public void check_addition()
    {
    	assertEquals(10,c.addition(10,0));
    	assertEquals(35,c.addition(75,-40));
    	assertEquals(45,c.addition(20,25));
    	assertEquals(-68,c.addition(-1,-67));
    	assertEquals(0,c.addition(10,-10));
    }
    @Test
    public void check_subtraction()
    {
    	assertEquals(10,c.subtraction(10,0));
    	assertEquals(115,c.subtraction(75,-40));
    	assertEquals(-5,c.subtraction(20,25));
    	assertEquals(66,c.subtraction(-1,-67));
    	assertEquals(20,c.subtraction(10,-10));
    }
    @Test 
    public void check_multiplication()
    {
    	assertEquals(55,c.multiplication(5,11));
    	assertEquals(144,c.multiplication(12,12));
    	assertEquals(-1,c.multiplication(-1,1));
    	assertEquals(-81,c.multiplication(-9,9));
    	assertEquals(0,c.multiplication(0,11));
    }
    @Test
    public void check_division()
    {
    	assertEquals(5,c.division(25,5));
    	assertEquals(0,c.division(2,3));
    	assertEquals(1,c.division(25,25));
    	assertEquals(6,c.division(18,3));
    	assertEquals(0,c.division(0,1525));
    }
    
}