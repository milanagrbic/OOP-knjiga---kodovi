public class ArgsKomandna{
	public static void main(String[] args){
			
		System.out.println("Broj argumenata komandne linije je: " + args.length);
		System.out.println("Ispis argumenata...");
			
		for(int i = 0; i < args.length;i++)
			System.out.println(args[i]);
	}
}