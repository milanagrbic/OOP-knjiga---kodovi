interface Letenje{
	public void poleti();	
}
interface Hodanje{
	public void hodaj();
}
class Patka implements Letenje,Hodanje{
	public void poleti(){
		System.out.println("Patka leti...");
	}
	public void hodaj(){
		System.out.println("Patka hoda...");
	}
}

public class ViseInterfejsa{
	
	public static void main(String[] args){
		Patka pata = new Patka();
		pata.poleti();
		pata.hodaj();
		
		Letenje letac = pata;
		letac.poleti();
		//letac.hodaj();//pogresno, interfejs Letenje nema metodu hodaj
		Hodanje hodac = pata;
		hodac.hodaj();
		//hodac.poleti();//pogresno, interfejs Hodanje nema metodu poleti
	}
}