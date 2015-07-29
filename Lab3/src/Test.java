import org.omg.Messaging.SyncScopeHelper;

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
		Persoana[] pers = new Persoana[10];
		// punem in vectr obiecte de tip sudent  si profesor (pun un student apoi un prof)
		for (int i = 0; i < 9; i = i + 2) {
			pers[i] = student; // sau pers[i] = (Persoana)student;
			pers[i + 1] = (Persoana)profesor;
		}
		
		// parcurg  vectrul si apelez metoda toString
		for (int i = 0; i < 10; i++)
			System.out.println(pers[i].toString());
		
		// ce trebuie sa observ?
		
		// exercitiul 5
		System.out.println("Exercitiul 5");
		
		// bulina 1
		System.out.println(profesor.preda());
		System.out.println(student.invata());
		
		// bulina 2
		System.out.println("====================================================");
		for (int i = 0; i < 10; i++) {
			if (!(pers[i] instanceof Profesor))
						; // nu fac nimic ca poate e de tipul student
			else {
			// in acest punct stiu sigur ca pers[i] e de tipul profesor
			// fac cast-ul
				Profesor p = (Profesor)pers[i];
				String string1 = p.preda();
				System.out.println(string1);
			}
			
		/*	if (!(pers[i] instanceof Student)) // pt bulina 3 scot aceasta bucata de cod
				continue;
			else {
				Student s = (Student)pers[i];
				String string2 = s.invata();
				System.out.println(string2);
			}*/
		}
		
		// bulina 3 obesrv ca nu se face cast-ul daca obiectul nu e de tipul Prof
		
		
		// exercitiul 6
		System.out.println("Exercitiul 6");
		SStiva stiva = new SStiva();
		int x = stiva.push(5);
		int y = stiva.pop();
		System.out.println("push " + x);
		System.out.println("pop " + y);
	}
		
}
