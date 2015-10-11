
public class Verificari {
	
		// verifica daca este dublu exemplar
		public boolean dubluExemplar (Carte a, Carte b)  {
				return a.titlu.equals(b.titlu);
		}
		
		// verifica care carte este mai groasa
		// intoarce cartea mai groasa
		public Carte grosime (Carte a, Carte b) {
			if (a.nrPagini >= b.nrPagini)
				return a;
			return b;
		}
}
