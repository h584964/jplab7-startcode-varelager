package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		
		Vare billigste = varer[0];
		
		
		for(int i = 1; i < varer.length; i++) {
			
		
		if(varer[i].erBilligereEnn(billigste)) {
			billigste = varer[i];
		}
	
	}
		return billigste;
}
	
	public static double totalPris(Vare[] varer) {		
		
		double total = 0.0;
		
		for (Vare v : varer) {
			total += v.getPris();
		}
		return total;	

	}
	
	public static int[] finnVarenr(Vare[] varer) {
				
		int [] varenr = new int [varer.length];
		
		for(int i = 0; i < varer.length; i++) {
			varenr[i] = varer[i].getVarenr();
		}
		return varenr;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
				
		throw new TODO("finnPrisDifferanser");

	}
}
