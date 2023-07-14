	class Cvor<T  extends Comparable<T>> {
	T podatak;
	Cvor<T> lijevo;
	Cvor<T> desno;
	
	Cvor(T podatak) {
		this.podatak = podatak;
		desno = null;
		lijevo = null;
	}
	
}

public class  BinarnoStablo<T extends Comparable<T>>{
	
	Cvor<T> korijen;
	
	private Cvor<T> dodajRekurzivno(Cvor<T> trenutni, T podatak) {
		if (trenutni == null) {
			return new Cvor<T>(podatak);
		}
		
		if (podatak.compareTo(trenutni.podatak) < 0) {
			
			trenutni.lijevo = dodajRekurzivno(trenutni.lijevo, podatak);
		} 
		else 
		
		if (podatak.compareTo(trenutni.podatak) > 0)  {
			trenutni.desno = dodajRekurzivno(trenutni.desno, podatak);
		} 
		else {
			// podatak vec postoji
			return trenutni;
		}
		
		return trenutni;
	}
	void dodaj(T podatak) {
		korijen = dodajRekurzivno(korijen, podatak);
	}
	private boolean sadrziCvorRekurzivno(Cvor<T> trenutni, T podatak) {
		if (trenutni == null) {
			return false;
		} 
		if(podatak.compareTo(trenutni.podatak) == 0) {
			return true;
		} 
		return  (podatak.compareTo(trenutni.podatak) < 0)
		? sadrziCvorRekurzivno(trenutni.lijevo, podatak)
		: sadrziCvorRekurzivno(trenutni.desno, podatak);
	}
	public boolean sadrziCvor(T podatak) {
		return sadrziCvorRekurzivno(korijen, podatak);
	}
	void ispisiStablo(Cvor<T> trenutni){
		if(trenutni == null)
			return;
		ispisiStablo(trenutni.lijevo);
		System.out.print(trenutni.podatak + "\t");
		ispisiStablo(trenutni.desno);
		
	}
	
	void ispisiStablo()
	{
		System.out.println("Ispis stabla.");
		ispisiStablo(korijen);
		System.out.println();
	}
	
	private Cvor<T> obrisiRekurzivno(Cvor<T> trenutni, T podatak) {
		if (trenutni == null) {
			return null;
		}
		
		if (podatak.compareTo(trenutni.podatak) == 0) {
			
			if (trenutni.lijevo == null && trenutni.desno == null) {
				return null;
			}
			if (trenutni.desno == null) {
				return trenutni.lijevo;
			}
			
			if (trenutni.lijevo == null) {
				return trenutni.desno;
			}
			Cvor<T> najmanji = pronadjiNajmanjuVrijednost(trenutni.desno);
			trenutni.podatak = najmanji.podatak;
			trenutni.desno = obrisiRekurzivno(trenutni.desno, najmanji.podatak);
			return trenutni;
			
		} 
		if (podatak.compareTo( trenutni.podatak) < 0) {
			trenutni.lijevo = obrisiRekurzivno(trenutni.lijevo, podatak);
			return trenutni;
		}
		trenutni.desno = obrisiRekurzivno(trenutni.desno, podatak);
		return trenutni;
	}
	public void obrisi(T podatak) {
		korijen = obrisiRekurzivno(korijen, podatak);
	}
	private Cvor<T> pronadjiNajmanjuVrijednost(Cvor<T> korijen) {
		return korijen.lijevo == null ? korijen : pronadjiNajmanjuVrijednost(korijen.lijevo);
	}
	
}