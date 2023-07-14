abstract class Zivotinja{
	abstract void ispustiZvuk();
}
abstract class Sisar extends Zivotinja{
}
public class Zec extends Sisar{
		void ispustiZvuk(){
		System.out.println("Zvuk zeca...");
}

public static void main (String[] args){
		Zec zeko = new Zec();
		zeko.ispustiZvuk();
	}
}