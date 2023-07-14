public class Klizac{
	public static void main(String[] args){
	//uvodi se pet ocjena na proizvoljan nacin
	double o1 = 4, o2 = 5, o3 = 1, o4 = 2, o5 = 4;			
	double najmanja = o1;
	if(o2 < najmanja)
		najmanja = o2;
	if(o3 < najmanja)
		najmanja = o3;
	if(o4 < najmanja)
		najmanja = o4;
	if(o5 < najmanja)
		najmanja = o5;
	double finalna = (o1+o2+o3+o4+o5-najmanja)/4;			
	System.out.println("Finalna ocjena je: " + finalna);		
	}
}