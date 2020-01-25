package dangeons;

public class Arma {

	private String arma;
	private int dannobase;
	private int magia;
	private String elemento;
	private int dannospada;
	
	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public int getDannobase() {
		return dannobase;
	}

	public void setDannobase(int dannobase) {
		this.dannobase = dannobase;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public int getDannospada() {
		return dannospada;
	}

	public void setDannospada(int dannospada) {
		this.dannospada = dannospada;
	}

	public Arma(String a, int d, int m, String e) {
		arma=a;
		dannobase=calcoloDannobase();
		magia=calcoloMagia();
		elemento=e;
	}
	
	public int calcoloDannobase() {
		dannobase=(int)(Math.random()*7+1);
		return dannobase;
	}
	
	public int calcoloMagia() {
		magia=(int)(Math.random()*5+1);
		return magia;
	}
	
	public int calcoloDannospada() {
		dannospada=dannobase+this.magia;
		return dannospada;
	}
	
	public static void main(String[] args)  {
		Arma a1=new Arma("pungolo",8,1, "ghiaccio");
	}
}

