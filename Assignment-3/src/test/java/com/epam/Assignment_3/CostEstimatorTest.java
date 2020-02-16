package com.epam.Assignment_3;

import static org.junit.Assert.assertEquals;
import com.epam.Assignment_3.HouseConstructionCostEstimator;

import org.junit.Test;


public class CostEstimatorTest 
{
	HouseConstructionCostEstimator hc=new HouseConstructionCostEstimator();
    @Test
    public void check_costs()
    {
        assertEquals(6494400.0,hc.cost("standard","no",5412),0.0);
        assertEquals(5034000.0,hc.cost("above standard","yes",3356),0.0);
        assertEquals(8136000.0,hc.cost("high standard","no",4520),0.0);
        assertEquals(1.13E7,hc.cost("high standard","yes",4520),0.0);
        assertEquals(0,hc.cost("any standard","no",5564),0.0);
    }
}
