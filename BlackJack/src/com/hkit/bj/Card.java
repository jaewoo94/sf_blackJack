package com.hkit.bj;

public class Card {

	public final String shape;
	public final String mark;
	public final int value;
	
	Card(String s, int m)
	{
		shape = s;
		mark = getMark(m);
		value = getValue(m);
	}
	
	private int getValue(int value)
	{
		int result = 0;
		
		if(value >= 10)
		{
			result = 10;
		}
		else
		{
			result = value + 1;
		}
		return result;
	}
	private String getMark(int value)
	{
		String result = "";
		
		switch(value)
		{
		case 0 : 
			result = "A";
			break;
		case 10 :
			result = "J";
			break;
		case 11 :
			result = "Q";
			break;
		case 12 :
			result = "K";
			break;
		default :
			result = Integer.toString(value+1);
			
		}
		return result;
	}
	
	
	@Override
	public String toString() {
		return String.format(shape + "-" + mark + "-" +value);
	}
	
	
	
}