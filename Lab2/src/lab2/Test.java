package lab2;

public class Test {

	public static void main(String[] args) {
		Punct punct = new Punct(1, 2);
		punct.afisare();
		punct.changeCoords(4, 6);
		punct.afisare();
		float[] v = {1, 2, 3, 4, 5, 6};
		Poligon  poli = new Poligon(v);
		
		// exercitiul 3
	
			long start = System.nanoTime();
			// functia al carei timp de executie vrem sa-l masuram
			int a = 2 + 3;
			System.out.println(System.nanoTime() - start);
		// ~~~~~~~~~~~
			long start2 = System.nanoTime();
			// functia al carei timp de executie vrem sa-l masuram
			Integer b = new Integer(2 + 3);
			System.out.println(System.nanoTime() - start2);
			
		// cncluzie dureaza mult mai mult sa creez obiectul
			
		System.out.println("exercitiul 4");
		// exercitiul 4
		
		String[] v1 = new String[10000];
		
		for (int i = 0; i < 10000; i++) {
			v1[i] = new String("abc");
		} //551240 - abc, 757608 - new String("abc")
		
		long usedMem2  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println(usedMem2);
			
		System.out.println("exercitiul 5");
		// exercitiul 5
		RandomStringGenerator d = new RandomStringGenerator (5, "abcdef");
		String string = d.next();
		System.out.println(string);
		
		// exercitiul 6
		PasswordMaker e = new PasswordMaker("Ramona", "Raducu", 20);
		String string6 = e.getPassword();
		System.out.println(string6);
		
		
		
			
			
		
	}

	

}
