
public class Profesor extends Persoana {
	private String materie;

	public Profesor () {
		this.materie = "POO"; //toString();	// nu stiu cum sa reutilizez codul scris ma gandii this.materie = toString(); dar imi apeleaza toString() 
									// de mai jos si in materis e initializata cu null 
	}
	// exercitiul 2
	public String toString() {	
		String string1 = "Profesor: ";
		Persoana prof =  new Persoana(); 
		// sau
		//Profesor pro = new Profesor();
		//String str = super.toString();
		
		String string2 = prof.toString();
		String string3 = materie;
		/*System.out.println("-----------------");
		System.out.println(string3);
		System.out.println("-----------------------");*/
		String string4 = string1 + string2 + string3;
		return string4;
	}
}
