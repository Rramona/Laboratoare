
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana persoana  = new Persoana();
		String nume = persoana.toString();
		Profesor profesor = new Profesor();
		Student student = new Student ();
		
		/// Instantiati clasele Profesor și Student, și apelați metoda toString() pentru fiecare instanță.
		System.out.println(profesor.toString());//  sau  System.out.println(profesor); 
		//System.out.println(student.toString());
		
		// exercitiul 2
		// bulina 1
		System.out.println("exercitiul 2 ");
		System.out.println(profesor);
		
		// bulina 2
		System.out.println(student);
		
		// exercitiul 3
		System.out.println("Exercitiul 3");
		System.out.println(student.equals(student));
		
		// exercitiul 4
		System.out.println("Exercitiul 4");
		Persoana pers = new Persoana();
		
		
		
	}

}
