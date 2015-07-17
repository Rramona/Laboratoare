package lab2;

public class Punct {
	private float x;
	private float y;
	
	public Punct (float x, float y) { // initializam x-ul sii y-ul
		this.x = x;
		this.y = y;
	}
	
	public void changeCoords (float x, float y) {
		this.x = x;
		this.y = y;		
	}
	
	public void afisare () {
		System.out.println("(" + x + ", " + y + ")");
	}
}
