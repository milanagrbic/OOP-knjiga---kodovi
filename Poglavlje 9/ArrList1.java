import java.util.ArrayList;
public class ArrList1{
	public static void main(String[] args){
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka();
		t1.setX(3);
		t1.setY(4);
		t2.setX(10);
		t2.setY(15);
		ArrayList lista = new ArrayList();
		lista.add(t1); //ubacuje se prva tacka u listu
		lista.add(t2); //ubacuje se druga tacka u listu
			
		System.out.println("Koordinata: " + ((Tacka)lista.get(0)).getX());//ispisuje se prva koordinata prvog elementa liste
			
		t1.setX(1000); //mijenja se vrijednost prve koordinate objekta t1
			
		System.out.println("Koordinata: " + ((Tacka)lista.get(0)).getX()); //ponovo se ispisuje prva koordinata prvog elementa liste
	}
}