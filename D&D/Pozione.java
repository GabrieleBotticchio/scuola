package dangeons;

public class Pozione extends Oggetti{
	
	public Pozione() {
		super(nome, costo, rarità);
	}
	
	public void nomePozione() {
		int d=(int)(Math.random()*7+1);
		switch(d){
		case 1:
			System.out.println("Pozione curativa lieve");
		break;
		case 2:
			System.out.println("Pozione orticante");
		break;
		case 3:
			System.out.println("Pozione invisibilità");
		break;
		case 4:
			System.out.println("Pozione veleno");
		break;
		case 5:
			System.out.println("Pozione velocità");
		break;
		case 6:
			System.out.println("Pozione curativa media");
		break;
		case 7:
			System.out.println("Pozione curativa potente");
		break;
		case 8:
			System.out.println("Pozione rispirare sott'acqua");
		}
		
		
	}
}
