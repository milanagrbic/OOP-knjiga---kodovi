abstract class Oblik{
	abstract double povrsina();
}
	
abstract class DvoDimenzionalniOblik extends Oblik{
}

public class Kvadrat extends DvoDimenzionalniOblik{
	double a;
	
 	double povrsina(){
		return a*a;
}
	
public static void main(String[] args){
	
	//Oblik obj = new Oblik(); nije dozvoljeno, klasa Oblik je apstraktna
	//DvodimenzionalniOblik obj = new DvodimenzionalniOblik(); nije dozvoljeno, klasa DvodimenzionalniOblik je takodje apstraktna
	
	
	Kvadrat obj = new Kvadrat();
	obj.a = 12;
	double povr = obj.povrsina();
	System.out.println(povr);	
}
}