	public class Student implements Comparable{
		
		private String brojIndeksa;
		private String ime;
		private String prezime;
		private double prosjek;
		
		
		public Student (String broj, String i, String p, double pr){
			brojIndeksa = broj;
			ime = i;
			prezime = p;
			prosjek = pr;
		}
		
		public String getBrojIndeksa(){
			return brojIndeksa;
		}
		
		public String getIme(){
			return ime;
		}
		
		
		public String getPrezime(){
			return prezime;
		}
		
		
		public double getProsjek(){
			return prosjek;
		}
		
		public String toString(){
			return brojIndeksa + " \t" + ime+ "\t" + prezime+" \t"+prosjek;
		}
		
		public boolean equals(Object s){
			return (brojIndeksa.equals(((Student) s).getBrojIndeksa()) && prezime.equals(((Student) s).getPrezime()) && ime.equals(((Student) s).getIme()) && (prosjek == ((Student) s).getProsjek()));
		}
		
		public int compareTo(Object s){
			int rez;
			
			double prosjekS = ((Student) s).getProsjek();
			
			if(prosjek<prosjekS)
				rez = -1;
			else if(prosjek>prosjekS)
				rez =  1;
			else{
				String imeS = ((Student) s).getIme();
				String prezimeS = ((Student) s).getPrezime();
				if (prezime.equals(prezimeS))
					rez = ime.compareTo(imeS);
				else
					rez = prezime.compareTo(prezimeS);
			}
			
			
			return rez;
		}	
	}