public class Fibonaci{
	public static void main(String[] args){
		int a = 1, b = 1;
		System.out.println(a);
		
		do{
			System.out.println(b);
			b = a + b;
			a = b - a;
		} while(b < 1000);
	}
}