package dangeons;

public class Balestra extends ArmaDaDistanza{
	private static int dannobalestra=8;

	public static int getDannobalestra() {
		return dannobalestra;
	}

	public static void setDannobalestra(int dannobalestra) {
		Balestra.dannobalestra = dannobalestra;
	}

	public Balestra(String n) {
		super("balestra",8);
	}
}
