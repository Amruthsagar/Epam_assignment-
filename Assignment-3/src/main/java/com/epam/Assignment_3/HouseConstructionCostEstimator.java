package com.epam.Assignment_3;

public class HouseConstructionCostEstimator
{
	public double cost(String material_type,String automation,double area)
	{
		if(material_type.equals("standard"))
			return area*1200;
		else if(material_type.equals("above standard"))
			return area*1500;
		else if(material_type.equals("high standard"))
		{
			if(automation.equals("no"))
				return 1800*area;
			else
				return 2500*area;
		}
		return 0;
	}
}