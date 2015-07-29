
public class SSStiva {
	// implementare cu agregare
	private int size;
	private final static int SUCCES = 0;
	Array a;
	int f;
	
	public SSStiva() { // pt initializare
		 a = new Array();
	}
	
	public SSStiva(int n) { 
		 a = new Array(n);
	}
	public int push (int elem) {
		
		// verificam daca mai este loc in vector
		if (size >= a.a.length) return a.ERROR;
		
		// adaug elementul elem in vector
		a.a[size] = elem;
		
		// cresc numarul de elemente;
		size++;
		
		// intorc SUCCES
		return SUCCES;
	}
	
	public int pop () {
		// verific daca vectorul contine elemente
		if (size == 0) return a.ERROR;
		
		// retin  elementul din varful stivei
		int element = a.a[size - 1];
		
		// scadem numarul de elemente
		size--;
		
		// intoarcem elementul
		return element;
		}
}
