public class BinarnoStabloTest{
	public static void main(String[] args){
		
		BinarnoStablo<Integer> bt = new BinarnoStablo<Integer>();
		
		bt.dodaj(6);
		bt.dodaj(4);
		bt.dodaj(8);
		bt.dodaj(3);
		bt.dodaj(5);
		bt.dodaj(7);
		bt.dodaj(9);	
		bt.ispisiStablo();
		int x = 4;
		if(bt.sadrziCvor(x))
		System.out.println("Stablo sadrzi element sa sadrzajem " + x);
		else
		System.out.println("Stablo ne sadrzi element sa sadrzajem " + x); 
		
		System.out.println("Brisanje elementa sa sadrzajem " + x);
		bt.obrisi(4);
		bt.ispisiStablo();
		if(bt.sadrziCvor(x))
		System.out.println("Stablo sadrzi element sa sadrzajem " + x);
		else
		System.out.println("Stablo ne sadrzi element sa sadrzajem " + x); 
		
		
		bt.obrisi(8);
		bt.ispisiStablo();
	}
}