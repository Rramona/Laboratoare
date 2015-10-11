import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// bulina 3
	/*	Scanner s = new Scanner(System.in);
		Carte carticica = new Carte ();
		carticica.titlu = s.nextLine();
		carticica.autor = s.nextLine();
		carticica.editura = s.nextLine();
		carticica.nrPagini = s.nextInt();
		 
		// bulina 4
		while (carticica.nrPagini == 0)
			carticica.nrPagini = s.nextInt();*/
		
		
		// exercitiul 4
		Carte a = new Carte ();
		Carte b = new Carte ();
		a.autor = "Ramona Raducu";
		b.autor = "Razvan Lungu";
		a.titlu = "poo";
		b.titlu = "informatica";
		a.editura = "Paralela45";
		b.editura = "Sigma";
		a.nrPagini = 100;
		b.nrPagini = 50;
		Verificari verificare = new Verificari ();
		if (verificare.dubluExemplar(a, b) == true)
			System.out.println("Exista dublu exemplar");
		else 
			System.out.println("Nu exista dublu exemplar");
		
		Carte c;
		c = verificare.grosime(a, b);
		System.out.println(c.titlu);
		
		// exercitiul 5
		System.out.println(a.titlu.toUpperCase());
		System.out.println(a.editura.toLowerCase());
		System.out.println(a.autor);
	}

}
