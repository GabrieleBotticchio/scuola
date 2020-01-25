package dangeons;

public class Arco extends ArmaDaDistanza{
	private static int dannoarco=9;
	
	public static int getDannoarco() {
		return dannoarco;
	}

	public static void setDannoarco(int dannoarco) {
		Arco.dannoarco = dannoarco;
	}

	public Arco(String n) {
		super("Arco",dannoarco);
	}
}
