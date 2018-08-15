package blackjack;

public class Deck{
	public final int max = 13;
	public int [] H = new int [max];
	public int [] C = new int [max];
	public int [] S = new int [max];
	public int [] D = new int [max];
	
	Deck() {
		for(int i = 0 ; i < max ; i++) {
			H[i]+=i+1;
			C[i]+=i+1;
			S[i]+=i+1;
			D[i]+=i+1;
		}
	}
}
