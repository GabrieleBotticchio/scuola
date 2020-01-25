

public class Armatura {

	public String nome;
	public String classearmatura;
	
	public Armatura(String n, String ca) {
		nome=n;
		classearmatura=ca;
	}
	
	public int calcoloClasseArmatura() {
		int ca=(int)(Math.random()*7+1);
		switch(ca) {
		case 1:
			System.out.println("Armatura imbottita");
		break;
		case 2:
			System.out.println("Armatura di lana");
		break;
		case 3:
			System.out.println("Armatura di cartone");
		break;
		case 4:
			System.out.println("Armatura di cuoio");
		break;
		case 5:
			System.out.println("Armatura di rame");
		break;
		case 6:
			System.out.prinln("Armatura di ferro");
		break;
		case 7:
			System.out.println("Armatura di carbonio");
		break;
		case 8:
			System.out.println("Armatura di vibranio");
		break;
			
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		Armatura ar1=new Arma
	}
}
