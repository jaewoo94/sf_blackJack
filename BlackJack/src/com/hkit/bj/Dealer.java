package com.hkit.bj;

public class Dealer extends Gamer{
		
	public boolean needMoreCard()
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
			sum += i.value;
			System.out.println("Dealer's Card :" + i);
		}
		System.out.println("sum = " + sum);
		System.out.println("-----------------------------");
	}
	
	public void needMoreCard(CardDeck cd)
	{
		int sum = myCards[0].value + myCards[1].value;
		if(sum <= 16)
		{
			myCards[2] = cd.pick();
		}
	}
}
