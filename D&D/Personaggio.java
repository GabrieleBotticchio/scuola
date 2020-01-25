package dangeons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Personaggio {
		
		private String nome;
		private String classe;
		private String razza;
		private float puntivita;
		private float difesa;
		private float tiropercolpire;
		private Arma spada;
		private Armatura armatura;
		private float livello;
		private int forza;
		private int destrezza;
		private int costituzione;
		private int intelligenza;
		private int saggezza;
		private int carisma;
		private static int modforza;
		private int moddestrezza;
		private static int modcostituzione;
		private int modintelligenza;
		private int modsaggezza;
		private int modcarisma;
		private int[] inventario;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getClasse() {
			return classe;
		}
		public void setClasse(String classe) {
			this.classe = classe;
		}
		public String getRazza() {
			return razza;
		}
		public void setRazza(String razza) {
			this.razza = razza;
		}
		public float getPuntivita() {
			return puntivita;
		}
		public void setPuntivita(float puntivita) {
			this.puntivita = puntivita;
		}
		public float getDifesa() {
			return difesa;
		}
		public void setDifesa(float difesa) {
			this.difesa = difesa;
		}
		public float getTiropercolpire() {
			return tiropercolpire;
		}
		public void setTiropercolpire(float tiropercolpire) {
			this.tiropercolpire = tiropercolpire;
		}
		public Arma getSpada() {
			return spada;
		}
		public void setSpada(Arma spada) {
			this.spada = spada;
		}
		public Armatura getArmatura() {
			return armatura;
		}
		public void setArmatura(Armatura armatura) {
			this.armatura = armatura;
		}
		public float getLivello() {
			return livello;
		}
		public void setLivello(float livello) {
			this.livello = livello;
		}
		public int getForza() {
			return forza;
		}
		public void setForza(int forza) {
			this.forza = forza;
		}
		public int getDestrezza() {
			return destrezza;
		}
		public void setDestrezza(int destrezza) {
			this.destrezza = destrezza;
		}
		public int getCostituzione() {
			return costituzione;
		}
		public void setCostituzione(int costituzione) {
			this.costituzione = costituzione;
		}
		public int getIntelligenza() {
			return intelligenza;
		}
		public void setIntelligenza(int intelligenza) {
			this.intelligenza = intelligenza;
		}
		public int getSaggezza() {
			return saggezza;
		}
		public void setSaggezza(int saggezza) {
			this.saggezza = saggezza;
		}
		public int getCarisma() {
			return carisma;
		}
		public void setCarisma(int carisma) {
			this.carisma = carisma;
		}
		public static int getModforza() {
			return modforza;
		}
		public static void setModforza(int modforza) {
			Personaggio.modforza = modforza;
		}
		public int getModdestrezza() {
			return moddestrezza;
		}
		public void setModdestrezza(int moddestrezza) {
			this.moddestrezza = moddestrezza;
		}
		public static int getModcostituzione() {
			return modcostituzione;
		}
		public static void setModcostituzione(int modcostituzione) {
			Personaggio.modcostituzione = modcostituzione;
		}
		public int getModintelligenza() {
			return modintelligenza;
		}
		public void setModintelligenza(int modintelligenza) {
			this.modintelligenza = modintelligenza;
		}
		public int getModsaggezza() {
			return modsaggezza;
		}
		public void setModsaggezza(int modsaggezza) {
			this.modsaggezza = modsaggezza;
		}
		public int getModcarisma() {
			return modcarisma;
		}
		public void setModcarisma(int modcarisma) {
			this.modcarisma = modcarisma;
		}
		public int[] getInventario() {
			return inventario;
		}
		public void setInventario(int[] inventario) {
			this.inventario = inventario;
		}
		public Personaggio(String n, String c, String r){
			nome=n;
			classe=c;
			razza=r;
			spada=new Arma("pungolo",6,1,"ghiaccio");
			armatura=new Armatura("armatura imbottita",7);
			difesa=calcoloDifesa(moddestrezza);
			puntivita=calcoloPuntivita(modcostituzione);
			tiropercolpire=calcoloTxc(modforza);
			livello=calcoloLivello();
			forza=calcoloForza();
			destrezza=calcoloDestrezza();
			costituzione=calcoloCostituzione();
			intelligenza=calcoloIntelligenza();
			saggezza=calcoloSaggezza();
			carisma=calcoloCarisma();
			modforza=calcolomodForza(forza);
			moddestrezza=calcolomodDestrezza(destrezza);
			modcostituzione=calcolomodCostituzione(costituzione);
			modintelligenza=calcolomodIntelligenza(intelligenza);
			modsaggezza=cacolomodSaggezza(saggezza);
			modcarisma=calcolomodCarisma(carisma);
			inventario=new int [10+modforza];
			
			
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
				System.out.println("Paladino");
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
			System.out.println("Dragonide");
		break;
		}
	}
			
		
		public float calcoloLivello() {
			livello=(int)(Math.random()*19+1);
			System.out.println("Il livello del tuo personaggio è di: " +livello);
			return livello;
		}
		
		public int calcoloForza() {
			int d1=(int)(Math.random()*7+1);
			int d2=(int)(Math.random()*7+1);
			int d3=(int)(Math.random()*7+1);
			forza=d1+d2+d3;
			return forza;
			
		}
		
		public int calcoloDestrezza() {
			int d1=(int)(Math.random()*7+1);
			int d2=(int)(Math.random()*7+1);
			int d3=(int)(Math.random()*7+1);
			destrezza=d1+d2+d3;
			return destrezza;
		}
		
		public int calcoloCostituzione() {
			int d1=(int)(Math.random()*7+1);
			int d2=(int)(Math.random()*7+1);
			int d3=(int)(Math.random()*7+1);
			costituzione=d1+d2+d3;
			return costituzione;
		}
		
		public int calcoloIntelligenza() {
			int d1=(int)(Math.random()*7+1);
			int d2=(int)(Math.random()*7+1);
			int d3=(int)(Math.random()*7+1);
			intelligenza=d1+d2+d3;
			return intelligenza;
		}
		
		public int calcoloSaggezza() {
			int d1=(int)(Math.random()*7+1);
			int d2=(int)(Math.random()*7+1);
			int d3=(int)(Math.random()*7+1);
			saggezza=d1+d2+d3;
			return saggezza;
		}
		
		public int calcoloCarisma() {
			int d1=(int)(Math.random()*7+1);
			int d2=(int)(Math.random()*7+1);
			int d3=(int)(Math.random()*7+1);
			carisma=d1+d2+d3;
			return carisma;
		}
		
		public int calcolomodForza(int forza) {
			modforza=(forza-10)/2;
			return modforza;
			
		}
		
		public int calcolomodDestrezza(int destrezza) {
			moddestrezza=(destrezza-10)/2;
			return moddestrezza;
		}
		
		public int calcolomodCostituzione(int costituzione) {
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
			difesa=10+moddestrezza+armatura.classearmatura;
			return difesa;
		}
		
		public float calcoloTxc(float modforza) {
			int d=(int)(Math.random()*19+1);
			tiropercolpire=d+modcostituzione+livello+spada.magia;
			return tiropercolpire;
		}
		
		public int calcoloDanni() {
			int danni=this.spada.calcoloDannospada()+modforza;
			return danni;
			
			
			
			
		}
		
		public void attacco(Personaggio p2) {
			p2.puntivita-=this.forza;
		}
		
		
		public static void combattimento(Personaggio p1, Personaggio p2) throws InterruptedException {
			if(p1.tiropercolpire>=p1.difesa) {
			
			do{
					System.out.println(p1.nome+" attacca "+p2.nome);
					System.out.println("Vita di "+p2.nome+": "+p2.puntivita);
					p1.attacco(p2);
					System.out.println("Vita rimanente a "+p2.nome+": "+p2.puntivita);
					if (p2.puntivita > 0) {
						TimeUnit.SECONDS.sleep(4); 
						System.out.println(p2.nome+" attacca "+p1.nome);
						TimeUnit.SECONDS.sleep(4);
						System.out.println("Vita di "+p1.nome+": "+p1.puntivita);
						p2.attacco(p1);
						System.out.println("Vita rimanente a "+p1.nome+": "+p1.puntivita);
					}
			}while (p1.puntivita>0 && p2.puntivita>0);

		}else{
			System.out.println("Hai mancato il colpo");
		}
			
		}
		public static void main(String[] args) throws IOException, InterruptedException {
			InputStreamReader input=new InputStreamReader(System.in);
			BufferedReader tastiera=new BufferedReader(input);
//			1° Personaggio
			String n=null, c=null, r=null;
			Personaggio p1=new Personaggio(n, c, r);
			System.out.println("Digita il nome della primo guerriero coinvolto in questa battaglia: "+n);
			n=tastiera.readLine();
			p1.classePersonaggio();
			System.out.println("La classe di"+n+ "e': "+p1.classe);
			p1.razzaPersonaggio();
			System.out.println("La razza di"+n+ "e':"+p1.razza);
			p1.calcoloLivello();
			System.out.println("Il livello di"+n+ "e' pari a: "+p1.livello);
			p1.calcoloPuntivita(modcostituzione);
			System.out.println("I punti vita di "+n+ "sono pari a: "+p1.puntivita);
			p1.calcoloTxc(modforza);
			System.out.println("Il valore del tiro per colpire di"+n+ "e' pari a: "+p1.tiropercolpire);
			
			
//			2° Personaggio
			Personaggio p2=new Personaggio(n, c, r);
			System.out.println("Digita il nome della secondo guerriero coinvolto in questa battaglia: "+n);
			n=tastiera.readLine();
			p1.classePersonaggio();
			System.out.println("La classe di"+n+ "e': "+p2.classe);
			p1.razzaPersonaggio();
			System.out.println("La razza di"+n+ "e':"+p2.razza);
			p1.calcoloLivello();
			System.out.println("Il livello di"+n+ "e' pari a: " +p2.livello);
			p1.calcoloPuntivita(modcostituzione);
			System.out.println("I punti vita di "+n+ "sono pari a: "+p2.puntivita);
			p1.calcoloTxc(modforza);
			System.out.println("Il valore del tiro per colpire di"+n+ "e' pari a: "+p2.tiropercolpire);

			
			combattimento(p1, p2);
				if(p2.puntivita>p1.puntivita) {
					System.out.println(p2.nome+"ha battuto "+p1.nome );
				}else if(p1.puntivita>p2.puntivita) {
					System.out.println(p1.nome+ "ha battuto "+p2.nome);
				}
			}
			
		
		
		

	}

