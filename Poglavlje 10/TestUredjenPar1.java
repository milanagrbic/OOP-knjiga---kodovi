public class TestUredjenPar1{
	public static void main(String[] args){
		
		Par<String, Integer> p1 = new UredjenPar<String, Integer>("Paran", 8);
		Par<String, String>  p2 = new UredjenPar<String, String>("Zdravo", "narode");
		
		System.out.println(p1.getKljuc());
		System.out.println(p2.getVrijednost());
		
		p2.setVrijednost("tabla");
		
		System.out.println(p2.getVrijednost());
		
		Par<String, Kutija<Integer>> p = new UredjenPar<>("brojevi", new Kutija<Integer>());
		Kutija<Integer> kut = new Kutija<Integer>();
		kut.set(888);
		p.setVrijednost(kut);
		
		System.out.println(p.getVrijednost().get());	
	}
}