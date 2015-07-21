
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
}
