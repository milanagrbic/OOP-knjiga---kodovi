	public class Krug{
		
		private static int broj = 0;
		private static final double pi = Math.PI;
		private double r;
		
		public Krug(){}
		public Krug(double k){
			r = k;
			broj++;
		}	
		public double povrsina(){
			return r * r * pi;
		}		
		public static int getBroj(){
			return broj;
		}		
		public String toString(){
			String s = broj + ". krug povrisne " + povrsina();
			return s;
		}	
	}