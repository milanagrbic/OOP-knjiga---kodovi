	public class Proizvodi{
		public static void main(String[] args)
		{
			int n = 5;
			int proizvod = 1;
			
			for(int i = -n; i <= n; i++)
			{
				if(i == 0)
				continue;//nula se preskace
				proizvod *= i; 
			}
			System.out.println("Proizvod je " + proizvod + ".");
		}
	}