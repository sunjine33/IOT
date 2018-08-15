package blackjack;

public class Dealer extends Deck {
	public final String heart = "H";
	public final String spade = "S";
	public final String clover = "C";
	public final String diamond = "D";
	
	
	public String random() {
		int rand = (int)(Math.random()*4)+1;

		String s = "";
		s = card(rand);
		return s;
	}

	String card(int rand) {
		int r = (int)(Math.random()*12);
		String s = "";
		switch(rand) {
		case 1:
			s = heart + H[r];
			H[r] = 0;
			break;
		case 2:
			s = spade + S[r];
			S[r] = 0;
			break;
		case 3:
			s = clover + C[r];
			C[r] = 0;
			break;
		case 4:
			s = diamond + D[r];
			D[r] = 0;
			break;
			}
		return s;
	}
}
