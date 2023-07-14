public class TestBrojevi{
	public static void main(String[] args){
		Double[] x = {1.4, 3.6, 8.2, 16.8};
		//dozvoljeno, jer je Double podklasa klase Number
		Brojevi<Double> obj = new Brojevi<Double>(x);
		double prosjek = obj.prosjecnaVrijednost();
		System.out.println(prosjek);
			
		String[] y = {"Tabla", "Kreda"};
		//sljedeci red nije dozvoljen, jer String nije podklasa klase Number
		//Brojevi<String> obj2 = new Brojevi<String>(y);
			
	}
}