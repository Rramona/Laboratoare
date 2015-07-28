
public class Stiva {
	// implementata cu mostenire
	Integer[] elemente = new Integer[10];
	Array b = new Array();
	
	
	public int Push extends int Array () {
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
				elemente[i]= b.set(i, 9);
				System.out.println(elemente[i]);
			}
			else
				continue;
			
		}
		return 0;			
	}
	
	public void afisareVector () {
		System.out.println(elemente);
	}
	
}
