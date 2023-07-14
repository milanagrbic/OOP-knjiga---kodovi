public class TackaTest{
	public static void main(String [] args){
			
		Tacka A, B;
		A = new Tacka();
		B = new Tacka();
			
		System.out.println("Nakon kreiranja tacaka:");
		System.out.println(A);
		System.out.println(B);
			
		A.setX(2);
		B.setY(3);
			
		System.out.println("Nakon podesavanja koordinata:");
		System.out.println(A);
		System.out.println(B);
			
		A.pomjeriGoreDesno();
		B.pomjeriGoreLijevo();
			
		System.out.println("Nakon pomjeranja:");
		System.out.println(A);
		System.out.println(B);		
	}
}