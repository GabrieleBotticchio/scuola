package dangeons;

public class Materiale extends Oggetti {

	public Materiale(String n) {
		super(nome, costo,rarità);
		
	}
	
	public void nomeMateriale() {
		int d=(int)(Math.random()*7+1);
		switch(d) {
		case 1:
			System.out.println("Pepita di rame");
		break;
		case 2:
			System.out.println("Pepita d'argento");
		break;
		case 3:
			System.out.println("Pepita d'oro");
		break;
		case 4:
			System.out.println("Adamantio");
		break;
		case 5:
			System.out.println("Legno");
		break;
		case 6:
			System.out.println("Metallo stellare");
		break;
		case 7:
			System.out.println("Pelle di drago");
		break;
		case 8:
			System.out.println("Platino");
		break;
		}
	}
}
