public class UgnijezdeneKlase{
	
	private int nbroj;
	private static int sbroj;
	private void nmetoda(){}
	private static void smetoda(){}
	
	static public class StatickaUgnijezdena{
		
		private int nbroj1;
		private static int sbroj1;
		
		private void metoda1(){
			
			//pristup statickoj promjenljivoj klase UgnijezdeneKlase
			UgnijezdeneKlase.sbroj = 15;
			
			//UgnijezdeneKlase.nbroj = 24;
			/*pristup nestatickoj promjenljivoj klase UgnijezdeneKlase 
			*Greska> non-static variable nbroj cannot be referenced from 
			*a static context*/
			
			//poziv statickog metoda klase UgnijezdeneKlase
			UgnijezdeneKlase.smetoda();
					
			//UgnijezdeneKlase.nmetoda();
			/*Pristup nestatickoj metodi klase UgnijezdeneKlase 
			*Greska> non-static method nmetoda() cannot be reference
			* from a static context*/
			
		}
		
		private static void smetoda1(){
			/*kao i u nestatickoj metodi mozemo pristupiti samo
			*statickim clanovima klase UgnijezdeneKlase*/
			
		}
		
	}
	
	public class Unutrasnja{
		//private static int sbroj2;
		/*Pokusaj deklarisanja staticke promjenljive u unutrasnjoj klasi
		*Greska> inner classes cannot have static declarations*/
		
		private int nbroj2;
		
		//private static void smetoda2(){}
		/*Pokusaj deklarisanja statickog metoda u unutrasnjoj klasi
		*Greska> inner classes cannot have static declarations*/
		
		private void nmetoda2(){
			
			nbroj2 = 23;
			
			//pristup clanovima Ugnijezdene klase
			UgnijezdeneKlase.sbroj = 14;	
			UgnijezdeneKlase.this.nbroj = 24;
			
			UgnijezdeneKlase.smetoda();			 	
			UgnijezdeneKlase.this.nmetoda();
			
			//pristup statickim clanovima staticke ugnijezdene klase	
			StatickaUgnijezdena.sbroj1 = 10;
			StatickaUgnijezdena.smetoda1(); 	
		}		 
	}
	
	public static void main (String [] args){
		
		UgnijezdeneKlase uk = new UgnijezdeneKlase();
			
		StatickaUgnijezdena suk1 = new StatickaUgnijezdena();
		StatickaUgnijezdena suk2 = new StatickaUgnijezdena();
			
		Unutrasnja u = uk.new Unutrasnja();
		
	}
}