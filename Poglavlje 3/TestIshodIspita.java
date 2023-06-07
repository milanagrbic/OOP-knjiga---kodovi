public class TestIshodIspita{
	public static void main(String[]args){
			
	/*for petljom se "prolazi" po svim mogucim vrijednostima
	*enumerativnog tipa IshodIspita*/
		for(IshodIspita ispit:IshodIspita.values())
			System.out.println(ispit + "\t" + ispit.getPoruka());		
	}
}