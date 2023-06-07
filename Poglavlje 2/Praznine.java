public class Praznine{
	public static void main(String[] args){
		
		String s = "tabla";
		String p = "kreda";
		boolean isti = true;
		
		if(s.length()!=p.length())
			isti = false;
		
		for(int i = 0;isti && i < s.length();i++)
			if(s.charAt(i) != p.charAt(i))
				isti = false;
				
		if(isti)
			System.out.println("Stringovi " + s + " i " + p + " su isti.");
		else
			System.out.println("Stringovi " + s + " i " + p + " nisu isti.");
	}
}