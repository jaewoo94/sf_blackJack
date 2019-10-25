package com.hkit.bj;

public class CardDeck {

	private Card[] cards;
	
	CardDeck()
	{
		init(); 
	}
	
	private void init()
	{
		int oneCardCnt = 13;
		String[] shapes = {"SPADE","HEART","CLOVER","DIAMOND"};
		cards = new Card[52];
		
		int count = 0;
		for(int i = 0; i <shapes.length; i++)
		{
			for(int j = 0; j<oneCardCnt; j++)
			{
				Card ca = new Card(shapes[i],j);
				cards[count] = ca;
				count++;
		
			}	
		}
	}
	
	public void shuffleCards()
	{
		Card temp = new Card("", 0);
		
		for(int i =0; i < cards.length; i++)
		{
			int rand = (int)(Math.random()*52);
			temp = cards[rand];
			cards[rand] = cards[i];
			cards[i] = temp;
		}
	}
	
	public void showCards()
	{
		for(Card c : cards)
		{
			System.out.println(c);
		}
	}
	
	public Card pick()
	{
		Card result = null;
		
		for(int i =0; i<cards.length; i++)
		{
			if(cards[i] != null)
			{
				result = cards[i];
				cards[i] = null;
				break;
			}
		}
		return result;
	}
}
