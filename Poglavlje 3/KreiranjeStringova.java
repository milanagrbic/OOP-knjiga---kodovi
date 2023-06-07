	public class KreiranjeStringova{
		public static void main(String[]args){
			String s1 = "abc";
			String s2 = "abc";
			String s3 = new String("abc");	
			
			System.out.println("Primjena metode equals na s1, s2 i s3");
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println(s2.equals(s3));
			
			System.out.println("Primjena operatora == s1, s2 i s3");
			System.out.println(s1 == s2);
			System.out.println(s1 == s3);
			System.out.println(s2 == s3);
		}
	}