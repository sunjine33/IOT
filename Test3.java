package blackjack;

import java.util.Scanner;

public class Test3 {
	public static void main(String[]args) {
		Setup su = new Setup();
		Deck d = new Deck();
		for(int i = 0 ; i < su.max ; i++) {
			System.out.println(su.H[i]);
		}
		String s = d.random();
		System.out.println(s);
	}
}
