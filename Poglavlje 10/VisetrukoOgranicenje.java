public class VisetrukoOgranicenje {
	public static void main(String[] args) {
		System.out.printf("Veci od %d, %d i %d je %d\n\n", 
		3, 4, 5, maximum( 3, 4, 5 ));
		
		System.out.printf("Veci od %.1f, %.1f i %.1f je %.1f\n\n",
		6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));
	}
	
	public static <T extends Number & Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;      
		if(y.compareTo(max) > 0) {
			max = y;   
		}
		
		if(z.compareTo(max) > 0) {
			max = z;                    
		}
		return max;      
	}
}