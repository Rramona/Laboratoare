
public class SStiva extends Array {
		// implementare cu mostenire
		private int size; // numarul curent de elemente din stiva
		private final static int SUCCES = 0;
		
		public SStiva () {
			super();
		}
		
		public SStiva (int n) {
			super(n);
		}
		
		public int push (int elem) {
			// verificam daca mai este spatiu in vector
			if (size >= a.length) return ERROR;
			
			// adaugam elementul in vector
			a[size] = elem;
			
			// crestem numarul de elemente
			size++;
			
			// intoarcem SUCCES
			return SUCCES;
		}
		
		public int pop () {
			// verific daca vectorul este gol
			if (size == 0) return ERROR;
			
			// retin elementul din varful stivei
			int elem = a[size - 1];
			
			// scad numarul de elemente;
			size--;
			
			//  intorc elementul
			return elem;
		}
}
