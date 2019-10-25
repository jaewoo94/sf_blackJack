package com.hkit.bj;

public class Gamer {
	protected Card[] myCards = new Card[10];
	protected int sum = 0;
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
		this.sum = 0;
		for(Card i : myCards)
		{
			if(i == null)
			{
				break;
			}
			sum += i.value;
			System.out.println("Gamer's Card :" + i);
		}
		System.out.println("sum = " + sum);
		System.out.println("-----------------------------");
	}
	
	public int getSum()
	{
		return this.sum;
	}
}
