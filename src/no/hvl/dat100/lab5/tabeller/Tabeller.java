package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {

			System.out.println(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
	
		String s = "[";
		for (int i = 0; i < tabell.length; i++) {
			s += tabell[i];
			if (i<tabell.length-1)
				s += ",";
			
		}
		return s +="]";
	}

	// c)
	public static int summer(int[] tabell) {
		
		int s = 0;
		for (int i = 0; i <tabell.length; i++) {

			s += tabell[i];
		}
		return s;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
	
		for (int i = 0; i<tabell.length; i++) {
			if(tabell[i] == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i<tabell.length; i++) {
			if(tabell[i] == tall) {			
			 return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] r = new int [tabell.length];
		int n = 0;
		for (int i = tabell.length - 1; i >= 0; i--) {
			r[n] = tabell[i];
			n++;
		}
			return r;
	}
	
	

	// g)
	public static boolean erSortert(int[] tabell) {
	
		for (int i = 0; i < tabell.length - 1; i++) {
			if(tabell[i] > tabell[i+1]) {
				return false;
			}
		}
		
		return true;
		
	}
			
		
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int[] sammensatt = new int [tabell1.length + tabell2.length];
		int nesteLedige = 0;
		
		for(int j = 0; j <tabell1.length; j++) {
				sammensatt[nesteLedige] = tabell1[j];
				nesteLedige ++;
			}
		for(int i = 0; i<tabell2.length; i++) {
				sammensatt[nesteLedige] = tabell2[i];
				nesteLedige++;
		}
		return sammensatt;
	}
	}
