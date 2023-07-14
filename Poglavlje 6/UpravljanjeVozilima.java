interface Upravljac {
	
	void promijeniStepenPrenosa(int a);
	void ubrzaj(int a);
	void zakoci(int a);
}

class Bicikl implements Upravljac{
	
	int stepenPrenosa;
	int brzina;
	
	public Bicikl(int sP, int b)
	{
		stepenPrenosa = sP;
		brzina = b;
	}
	
	public void promijeniStepenPrenosa(int noviStepen){
		System.out.println("Bicikl mijenja stepen prenosa...");
		stepenPrenosa = noviStepen;
	}
	
	public void ubrzaj(int x){
		
		brzina = brzina + x;
	}

	public void zakoci(int x){
		
		brzina = 0;
	}
	
	public void ispisiStatus() {
		System.out.println("brzina: " + brzina
		+ " stepen prenosa: " + stepenPrenosa);
	}
}

class Motocikl implements Upravljac {
	
	int stepenPrenosa;
	int brzina;
	public Motocikl(int sP, int b)
	{
		stepenPrenosa = sP;
		brzina = b;
	}
	
	public void promijeniStepenPrenosa(int noviStepen){
		System.out.println("Motocikl mijenja stepen prenosa...");
		if(stepenPrenosa == noviStepen)
			return;
		if(stepenPrenosa < noviStepen){
			System.out.println("Prelazim u visi stepen prenosa...");
			for(int i = stepenPrenosa+1; i <= noviStepen; i++)
			{
				stepenPrenosa++;
				System.out.println("Sada sam u " + stepenPrenosa + " stepenu prenosa");
			}	
			
		}
		else{
			System.out.println("Prelazim u nizi stepen prenosa...");
			for(int i = stepenPrenosa; i > noviStepen; i--)
			{
				stepenPrenosa--;
				System.out.println("Sada sam u " + stepenPrenosa + " stepenu prenosa");
			}
		}
		stepenPrenosa = noviStepen;
	}
	
	public void ubrzaj(int x){
		
		brzina = brzina + x;
	}
	
	public void zakoci(int x){
		
		brzina = brzina - x;
	}
	
	public void ispisiStatus() {
		System.out.println("brzina: " + brzina
		+ " stepen prenosa: " + stepenPrenosa);
	}	
}
public class UpravljanjeVozilima {
	
	public static void main (String[] args) {

		Bicikl bic = new Bicikl(6,15);
		bic.promijeniStepenPrenosa(2);
		bic.ubrzaj(3);
		bic.zakoci(1);
		
		System.out.println("Status bicikla:");
		bic.ispisiStatus();
		
		
		Motocikl mot = new Motocikl(5,8);
		mot.promijeniStepenPrenosa(2);
		mot.ubrzaj(4);
		mot.zakoci(3);
		
		System.out.println("Status motora:");
		mot.ispisiStatus();
	}
}