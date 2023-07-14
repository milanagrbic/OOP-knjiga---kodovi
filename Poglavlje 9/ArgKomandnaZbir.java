public class ArgKomandnaZbir{
	public static void main(String[] args){
			
		int zbir = 0;
		for(int i = 0; i < args.length; i++)
			zbir += Integer.parseInt(args[i]);
		System.out.println("Zbir je: " + zbir);
	}
}