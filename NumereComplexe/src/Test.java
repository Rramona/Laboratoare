
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumarComplex a = new NumarComplex ();
		NumarComplex b = new NumarComplex ();
		a.re = 1;
		b.re = 2;
		a.im = 4;
		b.im = 5;
		Operatii operatii = new Operatii ();
		NumarComplex c = operatii.adunare(a, b);
		System.out.println(operatii.adunare(a,b).re + " , " +  operatii.adunare(a, b).im);
		System.out.println(operatii.inmultire(a, b).re + " , " + operatii.inmultire(a, b).im);	

	}

}
