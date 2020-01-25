package dangeons;

public class Lancia extends ArmaDaMischia {
	private static int dannolancia=7;
	
	public static int getDannolancia() {
		return dannolancia;
	}

	public static void setDannolancia(int dannolancia) {
		Lancia.dannolancia = dannolancia;
	}

	public Lancia(String n) {
		super("lancia", dannolancia);
	}

}
