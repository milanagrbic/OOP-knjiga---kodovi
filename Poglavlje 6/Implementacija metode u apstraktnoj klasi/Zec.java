abstract class Zivotinja{
	abstract void ispustiZvuk();
}
abstract class Sisar extends Zivotinja{
		void ispustiZvuk(){
		System.out.println("Zvuk sisara...");
	}
}
public class Zec extends Sisar{

public static void main (String[] args){
		Zec zeko = new Zec();
		zeko.ispustiZvuk();
	}
}