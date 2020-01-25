package dangeons;

public class Vario extends Oggetti{

	public Vario() {
		super(nome, costo, rarità);
	}
	
	public void nomeVario() {
		int d=(int)(Math.random()*7+1);
		switch(d){
		case 1:
			System.out.println("");
		}
	}
}
