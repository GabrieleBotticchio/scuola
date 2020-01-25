package dangeons;

public class Spada extends ArmaDaMischia{
	private static int dannospada=8;
	
	public int getDannospada() {
		return dannospada;
	}

	public void setDannospada(int dannospada) {
		Spada.dannospada = dannospada;
	}

	public Spada(String n) {
		super("spada", dannospada);
	}

}
