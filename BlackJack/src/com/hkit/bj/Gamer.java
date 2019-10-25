package com.hkit.bj;

public class Gamer {
	protected Card[] myCards = new Card[10];
	
	public void addCard(Card card)
	{
		for(int i = 0; i<myCards.length; i++)
		{
			if(myCards[i] == null)
			{
				myCards[i] = card;
				break;
			}
		}
	}
	
	public void showCards()
	{
		for(Card i : myCards)
		{
			if(i == null)
			{
				break;
			}
			System.out.println("Gamer's Card :" + i);
		}
		System.out.println("-----------------------------");
	}
}
