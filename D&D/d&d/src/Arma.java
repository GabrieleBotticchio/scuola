public class Arma {

	public String arma;
	public int dannobase;
	public int magia;
	public String elemento;
	public int dannospada;
	
	public Arma(String a, int d, int m, String e) {
		arma=a;
		dannobase=d;
		magia=m;
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
		dannospada=dannobase+a1.magia;
		return dannospada;
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Arma a1=new Arma(a, d, m, e);
	}
}
