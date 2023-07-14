public class KutijaTest{
	public static void main(String[] args){
		Kutija<String> kut1 = new Kutija<String>();
		kut1.set("Tabla");
		System.out.println(kut1.get());
		
		
		Kutija<Integer> kut2 = new Kutija<Integer> ();
		kut2.set(1234);
		System.out.println(kut2.get());
		
		//Kutija<char> kut3 = new Kutija<char>(); pogresno - prosti tipovi ne mogu biti koristeni
	}
}