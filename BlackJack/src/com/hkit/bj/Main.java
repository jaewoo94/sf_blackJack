package com.hkit.bj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CardDeck ca = new CardDeck();
			Gamer g = new Gamer();
			Dealer d = new Dealer();
			Rule r = new Rule();
	
			ca.shuffleCards();
			
			//ca.showCards();
			//System.out.println();
			
			for(int i = 0; i<2; i++)
			{
				d.addCard(ca.pick());
				g.addCard(ca.pick());		
			}
			
			if(d.rule() == true)
			{
				d.addCard(ca.pick());
			}
			
			
			g.showCards();			
			d.showCards();
		
			r.check(r.measurement(g),r.measurement(d));
			
	}

}
