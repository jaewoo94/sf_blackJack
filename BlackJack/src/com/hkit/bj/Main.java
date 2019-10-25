package com.hkit.bj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			CardDeck ca = new CardDeck();
			Gamer gm = new Gamer();
			Dealer dl = new Dealer();
			Rule ru = new Rule();
	
			Scanner scan = new Scanner(System.in);
			
			String key = "";
			ca.shuffleCards();

			for(int i = 0; i<2; i++)
			{
				dl.addCard(ca.pick());
				gm.addCard(ca.pick());		
			}
			
			/*
			if(d.needMoreCard() == true)
			{
				d.addCard(ca.pick());
			}
			*/
			
			dl.needMoreCard(ca);
				
			gm.showCards();			
			
		
			
			while(true)
			{
				System.out.println("더 뽑을려면 y : ");
				key = scan.nextLine();
				if(key.equals("y")) 
				{
					gm.addCard(ca.pick());
					gm.showCards();
				}
				else 
				{
					break;
				}	
			}
			scan.close();
			//ru.check(ru.measurement(gm),ru.measurement(dl));
			dl.showCards();
			ru.getWinner(gm.getSum(),dl.getSum());
			
	}
}
