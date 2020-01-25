package dangeons;

public class Oggetti {
	public static String nome;
	public static float costo;
	public static int rarità;
	public Oggetti(String n, float c, int r) {
		n=nome;
		c=calcolaCosto();
		r=calcolaRarità();
	}

	public float calcolaCosto() {
		costo=(int)(Math.random()*100+1);
		return costo;
	}
	
	public int calcolaRarità() {
		rarità=(int)(Math.random()*4+1);
		return rarità;
	}
}
