package lab2;

public class PasswordMaker {
	static RandomStringGenerator d = new RandomStringGenerator (20, "abcdefgh");
	private final static int  MAGIC_NUMBER = 10;
	private final static  String MAGIC_STRING = d.next();
	private String firstName;
	private String lastName;
	private int age;
	
	public PasswordMaker(String firstName, String lastName, int age) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;		
	}
	
	public String getPassword () {
		String string1 = firstName.substring(firstName.length()  - age % 3);
		
		// obtinem  sirul din 10 caractere
		RandomStringGenerator q = new RandomStringGenerator(10, MAGIC_STRING);
		String str = q.next();
		RandomStringGenerator r = new RandomStringGenerator(MAGIC_NUMBER, str);
		String string2 = r.next();
		
		int x = age + lastName.length();
		String string3 = Integer.toString(x);
		
		String string4 = string1 + string2 + string3;
		
		return string4;
		
	}	
}
