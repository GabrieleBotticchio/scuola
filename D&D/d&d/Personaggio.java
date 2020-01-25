package d&d;

public class Personaggio {
	
	public String nome;
	public String classe;
	public String razza;
	public float puntivita;
	public float difesa;
	public float tiropercolpire;
	public Arma spada;
	public Armatura armatura;
	public float livello;
	public int forza;
	public int destrezza;
	public int costituzione;
	public int intelligenza;
	public int saggezza;
	public int carisma;
	public int modforza;
	public int moddestrezza;
	public int modcostituzione;
	public int modintelligenza;
	public int modsaggezza;
	public int modcarisma;
	
	public Personaggio(String n, String c, String r, float hp, float d, float txc, Arma s, Armatura a){
		nome=n;
		classe=c;
		razza=r;
		puntivita=hp;
		difesa=d;
		tiropercolpire=txc;
		arma=s;
		armatura=a;
	}
	public void classePersonaggio() {
		int d=(int)(Math.random()*7+1);
		switch(d) {
		case 1:
			System.out.println("Barbaro");
		break;
		case 2:
			System.out.println("Bardo");
		break;
		case 3:
			System.out.println("Chierico");
		break;
		case 4:
			System.out.println("Druido");
		break;
		case 5:
			System.out.println("Guerriero");
		break;
		case 6:
			System.out.println("Ladro");
		break;
		case 7:
			System.out.println("Mago");
		break;
		case 8:
			Sysem.out.println("Paladino");
		break;
		}
	}
	
	public void razzaPersonaggio() {		
	int d=(int)(Math.random()*7+1);
	switch(d) {
	case 1:
		System.out.println("Umano");
	break;
	case 2:
		System.out.println("Gnomo");
	break;
	case 3:
		System.out.println("Nano");
	break;
	case 4:
		System.out.println("Elfo");
	break;
	case 5:
		System.out.println("Orco");
	break;
	case 6:
		System.out.println("Orchetto");
	break;
	case 7:
		System.out.println("Elfetto");
	break;
	case 8:
		Sysem.out.println("Dragonide");
	break;
	}
}
		
	}
	public void calcoloLivello() {
		livello=(int)(Math.random()*19+1);
		System.out.println("Il livello del tuo personaggio è di: " +liv);
	}
	
	public void calcoloForza() {
		int d1=(int)(Math.random()*7+1);
		int d2=(int)(Math.random()*7+1);
		int d3=(int)(Math.random()*7+1);
		forza=d1+d2+d3;
		
	}
	
	public void calcoloDestrezza() {
		int d1=(int)(Math.random()*7+1);
		int d2=(int)(Math.random()*7+1);
		int d3=(int)(Math.random()*7+1);
		destrezza=d1+d2+d3;
	}
	
	public void calcoloCostituzione() {
		int d1=(int)(Math.random()*7+1);
		int d2=(int)(Math.random()*7+1);
		int d3=(int)(Math.random()*7+1);
		costituzione=d1+d2+d3;
	}
	
	public void calcoloIntelligenza() {
		int d1=(int)(Math.random()*7+1);
		int d2=(int)(Math.random()*7+1);
		int d3=(int)(Math.random()*7+1);
		intelligenza=d1+d2+d3;
	}
	
	public void calcoloSaggezza() {
		int d1=(int)(Math.random()*7+1);
		int d2=(int)(Math.random()*7+1);
		int d3=(int)(Math.random()*7+1);
		saggezza=d1+d2+d3;
	}
	
	public void calcoloCarisma() {
		int d1=(int)(Math.random()*7+1);
		int d2=(int)(Math.random()*7+1);
		int d3=(int)(Math.random()*7+1);
		carisma=d1+d2+d3;
	}
	
	public int calcolomodForza(int forza) {
		modforza=(forza-10)/2;
		return modforza;
	}
	
	public int calcolomodDestrezza(int destrezza) {
		moddestrezza=(destrezza-10)/2;
		return moddestrezza;
	}
	
	public int calocolomodCostituzione(int costituzione) {
		modcostituzione=(costituzione-10)/2;
		return modcostituzione;
	}
	
	public int calcolomodIntelligenza(int intelligenza) {
		modintelligenza=(intelligenza-10)/2;
		return modintelligenza;
	}
	
	public int cacolomodSaggezza(int saggezza) {
		modsaggezza=(saggezza-10)/2;
		return modsaggezza;
	}
	
	public int calcolomodCarisma(int carisma) {
		modcarisma=(carisma-10)/2;
		return modcarisma;
	}
	
	public float calcoloPuntivita(float modcostituzione) {
		int d=(int)(Math.random()*9+1);
		puntivita=(d+modcostituzione)*livello;
		return puntivita;
	}
	
	public float calcoloDifesa(float moddestrezza) {
		difesa=10+moddestrezza+Armatura.classearmatura;
		return difesa;
	}
	
	public float calcoloTxc(float modforza) {
		int d=(int)(Math.random()*19+1);
		tiropercolpire=d+modcostituzione+livello+Spada.magia;
		return tiropercolpire;
	}
	
	public int calcoloDanni(Personaggio modforza) {
		danni=p1.calcoloDannospada+modforza;
		return danni;
		
		
		
		
	}
	
	public void attacco(Personaggio forza) {
		p1.puntivita-=p1.forza;
		System.out.println("La tua forza e' pari a "p1.forza);
		
	}
	
	
	public void combattimento(personacom p1, personacom p2) throws InterruptedException {
		if(p1.txc>=p1.difesa) {
		
		do{
				System.out.println(p1.nome+" attacca "+p2.nome);
				System.out.println("Vita di "+p2.nome+": "+p2.puntivita);
				p1.attacco(p2);
				System.out.println("Vita rimanente a "+p2.nome+": "+p2.vita);
				if (p2.vita > 0) {
					TimeUnit.SECONDS.sleep(4); 
					System.out.println(p2.nome+" attacca "+p1.nome);
					TimeUnit.SECONDS.sleep(4);
					System.out.println("Vita di "+p1.nome+": "+p1.puntivita);
					p2.attacco(p1);
					System.out.println("Vita rimanente a "+p1.nome+": "+p1.puntivita);
				}
		}while (p1.vita>0 && p2.vita>0);

	}else{
		dannospada=0;
	}
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(input);
//		1° Personaggio
		System.out.println("Digita il nome della primo guerriero coinvolto in questa battaglia: "+n);
		n=tastiera.readLine();
		p1.classePersonaggio();
		System.out.println("La classe di"+n "e': "+p1.classe);
		p1.razzaPersonaggio();
		System.out.println("La razza di"+n "e':"+p1.razza);
		p1.calcoloLivello();
		System.out.println("Il livello di"+n "e' pari a: "+p1.livello);
		p1.calcoloPuntivita();
		System.out.println("I punti vita di "+n"sono pari a: "+p1.puntivita);
		p1.calcoloTxc();
		System.ou.println("Il valore del tiro per colpire di"+n "e' pari a: "+p1.tiropercolpire);
		Personaggio p1=new Personaggio(n, c, r, hp, d, txc, s, a);
		
//		2° Personaggio
		System.out.println("Digita il nome della secondo guerriero coinvolto in questa battaglia: "+n);
		n=tastiera.readLine();
		p1.classePersonaggio();
		System.out.println("La classe di"+n "e': "+p2.classe);
		p1.razzaPersonaggio();
		System.out.println("La razza di"+n "e':"+p2.razza);
		p1.calcoloLivello();
		System.out.println("Il livello di"+n "e' pari a: "+p2.livello);
		p1.calcoloPuntivita();
		System.out.println("I punti vita di "+n"sono pari a: "+p2.puntivita);
		p1.calcoloTxc();
		System.out.println("Il valore del tiro per colpire di"+n "e' pari a: "+p2.tiropercolpire);
		Personaggio p2=new Personaggio(n, c, r, hp, d, txc, s, a);
		
		Combattimento(p1, p2){
			if(p2.puntivita>p1.puntivita) {
				System.out.println(p2.nome"ha battuto "+p1.nome "in questa battaglia");
			}else if(p1.puntivita>p2.puntivita) {
				System.out.println(p1.nome"ha battuto "+p2.nome "in questa battaglia");
			}
		}
		
	
	
	

}
