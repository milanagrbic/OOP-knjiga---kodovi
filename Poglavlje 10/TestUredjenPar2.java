public class TestUredjenPar2{
	static <K, V> boolean uporedi(UredjenPar<K, V> p1, UredjenPar<K, V> p2) {
		return p1.getKljuc().equals(p2.getKljuc()) && p1.getVrijednost().equals(p2.getVrijednost());
	}
	public static void main(String[] args){
				
		UredjenPar<String, Integer> p1 = new UredjenPar<String, Integer>("tabla", 3);
		UredjenPar<String, Integer> p2 = new UredjenPar<String, Integer>("olovka", 2);
		UredjenPar<String, Integer> p3 = new UredjenPar<String, Integer>("tabla", 3);
				
		if(uporedi(p1,p2))
			System.out.println("Jednaki parovi.");
		else
			System.out.println("Nisu jednaki parovi.");
				
		if(uporedi(p1,p3))
			System.out.println("Jednaki parovi.");
		else
			System.out.println("Nisu jednaki parovi.");	
	}
}