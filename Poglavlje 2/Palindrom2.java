public class Palindrom2{
	public static void main(String[] args){
			
		String s = "anavolimilovana";
		boolean jeste = true;
		for(int i = 0; i < s.length()/2 && jeste;i++)
			if(s.charAt(i) != s.charAt(s.length()-1-i))
				jeste = false;	
			
		if(jeste)
			System.out.println("Rijec " + s + " jeste palindrom");
		else
			System.out.println("Rijec " + s + " nije palindrom");	
			
	}	
}