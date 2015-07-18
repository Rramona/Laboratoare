package lab2;

public class Poligon {
	
	private Punct[] puncte;
	
	// bulina 1
	public Poligon (int n) {
		puncte = new Punct[n];// vectorul e plin cu null-uri
	}
	
	// bulina 2
	
	public Poligon (float[] v) {
		this(v.length/2);// crearam v de 2n puncte
		
		//un constructor care preia ca parametru un vector, cu 2n numere reale reprezentând
		//colțurile. Acest constructor apelează constructorul de la punctul de mai sus și 
	   //	completează vectorul de puncte cu cele n instanțe ale clasei Punct obținute din 
		//parametrii primiți.
		// parcurgem vectorul
		for (int i = 0; i < v.length/2; i++) {
			puncte[i]  = new Punct(v[2 * i],v[2 * i + 1]);
			
		}
		
		for (int i = 0; i < v.length/2; i++) {
			puncte[i].afisare();
		}

		
	}
	

}
