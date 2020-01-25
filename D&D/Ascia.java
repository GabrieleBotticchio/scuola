package dangeons;

public class Ascia extends ArmaDaMischia{
	private static int dannoascia=10;
	
	public static int getDannoascia() {
		return dannoascia;
	}

	public static void setDannoascia(int dannoascia) {
		Ascia.dannoascia = dannoascia;
	}

	public Ascia(String n) {
		super("ascia", dannoascia);
	}

	
}
