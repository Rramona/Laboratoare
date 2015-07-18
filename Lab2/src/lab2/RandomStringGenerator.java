package lab2;

import java.util.Random;

public class RandomStringGenerator {
	private int lungime;
	private String alfabet;
	
	public RandomStringGenerator (int lungime, String alfabet) {
		this.lungime = lungime;
		this.alfabet = alfabet;	
	}
	
	// apel constructor
	// RandomStringGenerator myGenerator = new RandomStringGenerator(5, "abcdef"); 
	
	public String next () {
		char[] alfabet_aux = alfabet.toCharArray();// convertesc string-ul la char, apoi fac prelucrari asupra char-ului pt ca string-ul este imutabil
		char[] string_aux = new char[lungime];
		
		// generez random un indice
		Random generator = new Random();
		
		//construim string-ul
		for (int i = 0; i < lungime; i++) {
			int value = generator.nextInt(alfabet.length());
			string_aux[i] = alfabet_aux[value];
		}
		
		// convertim la string
		String string = new String(string_aux);
		return string;
		
	}
}
