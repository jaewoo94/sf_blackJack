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
	
	public static void getWinner(int gv, int dv)
	{
		/*
		int r1 = Math.abs(21 - gv);
		int r2 = Math.abs(21 - dv);
		*/
		
		int r1 = 21 - gv;
		int r2 = 21 - dv;
		
		
		if(r1 <0 && r2 < 0 || r1 == r2)
		{
			System.out.println("Draw!!!!");
		}
		else if (r1 > 0 && r2 > 0)
		{
			if(r1 < r2)
			{
				System.out.println("Gamer Win!!!!");
			}
			else 
			{
				System.out.println("Gamer Lose!!!!");
			}
		}
		else if(r2 > 0 && r1< 0)
		{
			System.out.println("Gamer Lose!!");
		}
		else
		{
			System.out.println("Gamer Win!!!!");
		}
	}
	
	
	
}
