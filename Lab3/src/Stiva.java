
public class Stiva  extends Array {
	
	// implementata cu mostenire
	Integer[] elemente = new Integer[10];
	Array b = new Array();
	int pos;
	
	public int Push () {
		// verificam daca stiva este plina
		if (b.get(elemente.length) != 0)
			return b.ERROR;
		// in acest punct stiu ca stiva nu este plina si adaug o noua valoare
		
		// gasesc pozitia libera
		for (int i = 0; i < elemente.length; i++) {
			
			//verificam daca s-a umplut stiva
			if (b.set(i, 3) == b.ERROR)
				break;
			
			// stim ce vectorul din clasa Array e plin cu zerouri // ca sa nu suprascriu
			if (b.get(i) == 0){
				 b.set(i, 9);
				System.out.println(b.a[i]);
				break;// daca vreau sa introduc doar un numar
			}
			else
				continue;
			
		}
		return 0;			
	}
	
	/// !!!! Stiva contine elemente diferite de zero
	public int Pop () {
		// verificam daca stiva este goala
		if (b.a[0] == 0) 
			return b.ERROR;
		// in  acest punct in stiva se afla cel putin un element si caut varful stivei
		for (int i = elemente.length; i > 0; i--) {
			if (b.a[i] != 0) {
				 pos = i;
				break;
			}
		}
			
		int x = b.a[pos];
		b.a[pos] = 0;
		return x;
	}
	
}
