package com.hkit.bj;

public class Rule {
	
	
	public int measurement(Gamer g)
	{
		int sum = 0;
		
		for(int i = 0; i < g.myCards.length; i++)
		{
			if(g.myCards[i] == null)
			{
				break;
			}
			sum += g.myCards[i].value;
		}
		return sum;
	}
	
	public void check(int a, int b)
	{
		int r1 = 21 - a;
		int r2 = 21 - b;
		
		r1 = Math.abs(r1);
		r2 = Math.abs(r2);
		
		if(r1 < r2)
		{
			System.out.println("Gamer Win!!!!");
		}
		else
		{
			System.out.println("Gamer Lose!!!!");
		}
		
	}
	
}
