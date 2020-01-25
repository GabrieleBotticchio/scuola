package dangeons;

public class Armatura {

	private String nome;
	private int classearmatura;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClassearmatura() {
		return classearmatura;
	}

	public void setClassearmatura(int classearmatura) {
		this.classearmatura = classearmatura;
	}

	public Armatura(String n, int ca) {
		nome=n;
		classearmatura=ca;
	}
	
	public void calcoloClasseArmatura() {
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
			System.out.println("Armatura di ferro");
		break;
		case 7:
			System.out.println("Armatura di carbonio");
		break;
		case 8:
			System.out.println("Armatura di vibranio");
		break;
			
		}
	}
	public static void main(String[] args)  {
		Armatura ar1=new Armatura("mitril", 5);
	}
}

