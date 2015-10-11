
public class Operatii {

	NumarComplex rez = new NumarComplex();
	public NumarComplex adunare (NumarComplex a, NumarComplex b) {
		rez.re = a.re + b.re;
		rez.im = a.im + b.im;
		return rez;	
	}
	
	public NumarComplex inmultire (NumarComplex a, NumarComplex b) {
		rez.re = a.re * b.re;
		rez.im = a.im * b.im;
		return rez;
	}

}
