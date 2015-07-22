
public class Student extends  Persoana{
	
	private int nota; 	
	public Student () {
		this.nota = 10;
	}
	public String toString () {
		String string1 = "Student: ";
		Persoana student = new Persoana();
		String string2  = student.toString();
		String string3 = Integer.toString(nota);
		return string1 + string2 + string3;
		}
	
	// exercitiul 3
	public boolean equals(Object o) {		
		if (!(o instanceof Student))	// asta inseamna ca daca o sa compari un Student cu 
		// orice alt tip de obiect (Caine, Animal, String,
	    // Integer) o sa-ti dea false
			return false;
		
		// in punctul asta, esti sigura ca obiectul primit
		// ca parametru e de tip student => 
		//  => putem sa-l convertim
		
		Student s = (Student)o;
		
		// comparam studentul curent cu studentul s
		if (this.nume.equals(s.nume) && this.nota == s.nota)
			return true;
		else 			
			return false;
	}	
}