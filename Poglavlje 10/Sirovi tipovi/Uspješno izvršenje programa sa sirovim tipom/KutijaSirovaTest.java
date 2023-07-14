public class KutijaSirovaTest{
	public static void main(String[] args){
			
		Kutija kut1 = new Kutija();
		kut1.set("Tabla");
		String obj = (String)kut1.get();
		System.out.println(obj);
	}
}