package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i=0; i<matrise.length; i++) {
			for(int j=0;j<matrise.length; j++) {
				
				System.out.println(matrise[i][j]);
			
				}
			}
		}

	// b)
	public static String tilStreng(int[][] matrise) {

		String s = "{";
		for (int i = 0; i < matrise.length; i++){	
			for (int j = 0; j <matrise.length; j++) {
			s += matrise[i][j];
			if (j<matrise.length-1)
				s += ",";
			}
		}
		return s +="}";
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
			
		for (int i=0; i<matrise.length; i++) {
			for(int j=0;j<matrise.length; j++) {
				i = i*tall;
				j = j*tall;
						
				}
			}
		return matrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		
		for (int i=0; i<a.length && i<b.length; i++) {
			for(int j=0;j<a.length && j<b.length; j++) {
				if(a[i][j] == b[i][j])
					return true;
				
				}
			}
			return false;
		}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
