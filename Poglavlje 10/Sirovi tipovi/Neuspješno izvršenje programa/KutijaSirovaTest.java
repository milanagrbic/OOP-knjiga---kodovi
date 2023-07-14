public class KutijaSirovaTest{
	public static void main(String[] args){
			
		Kutija<String> kut1 = new Kutija<String>();
		kut1.set(Boolean.FALSE); //ubacuje se neodgovarajuci objekat
		String obj = (String)kut1.get();
		System.out.println(obj);
	}
}