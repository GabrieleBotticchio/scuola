package dangeons;

public class Oggetti {
	public static String nome;
	public static float costo;
	public static int rarit�;
	public Oggetti(String n, float c, int r) {
		n=nome;
		c=calcolaCosto();
		r=calcolaRarit�();
	}

	public float calcolaCosto() {
		costo=(int)(Math.random()*100+1);
		return costo;
	}
	
	public int calcolaRarit�() {
		rarit�=(int)(Math.random()*4+1);
		return rarit�;
	}
}
