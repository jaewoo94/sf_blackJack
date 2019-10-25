package com.hkit.bj;

public class Dealer extends Gamer{
	
	Gamer aa = new Gamer();
	
	public boolean rule()
	{
		boolean result = false;
		int sum = myCards[0].value + myCards[1].value;
		if(sum <= 16)
		{
			result = true;
		}
		return result;
	}
	
	public void showCards()
	{
		for(Card i : myCards)
		{
			if(i == null)
			{
				break;
			}
			System.out.println("Dealer's Card :" + i);
		}
		System.out.println("-----------------------------");
	}
}
