class Cvor <T>{    
	T podatak;    
	Cvor<T> sljedeci;    
	
	public Cvor(T t) {    
		this.podatak = t;    
		this.sljedeci = null;    
	}    
} 

public class JednostrukoPovezanaLista<T> {    

	//reference na prvi i posljednji element  
	public Cvor<T> pocetni = null;    
	public Cvor<T> zadnji = null;    
	
	//metoda za dodavanje novog elementa   
	public void dodajCvor(T podatak) {    
		//Prvo se napravi novi cvor    
		Cvor<T> novi = new Cvor<T>(podatak);    
		
		//Provjera da li je lista prazna   
		if(pocetni == null) {    
			//Ako jeste, onda su pocetni i posljednji element jednaki novom
			pocetni = novi;    
			zadnji = novi;    
		}    
		else {    
			//element se dodaje na kraj liste   
			zadnji.sljedeci = novi;    
			//azuriranje reference na posljednji element   
			zadnji = novi;    
		}    
	}    
	
	public void ispisListe() {    
		
		Cvor<T> trenutni = pocetni;    
		
		if(pocetni == null) {    
			System.out.println("Lista je prazna.");    
			return;    
		}    
		System.out.println("Elementi liste: ");    
		while(trenutni != null) {     
			System.out.print(trenutni.podatak + " ");    
			trenutni = trenutni.sljedeci;    
		}    
		System.out.println();    
	}    
	
	public static void main(String[] args) {    
		
		JednostrukoPovezanaLista<Integer> bList = new JednostrukoPovezanaLista<Integer>();    
		
		//dodavanje nekoliko elemenata 
		bList.dodajCvor(1);    
		bList.dodajCvor(2);    
		bList.dodajCvor(3);    
		bList.dodajCvor(4);    
		
		//ispis liste   
		bList.ispisListe(); 
		
		JednostrukoPovezanaLista<String> sList = new JednostrukoPovezanaLista<String>();    
		
		//dodavanje nekoliko elemenata 
		sList.dodajCvor("tabla");    
		sList.dodajCvor("kreda");    
		sList.dodajCvor("olovka");      
		
		//ispis liste   
		sList.ispisListe();      
	}    
}    