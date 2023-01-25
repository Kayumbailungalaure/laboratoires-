package ht.bac3;

import java.util.HashMap;
import java.util.Map;

public class Dsignation {

	public static void main(String[] args) {
		HashMap <Long, String> maparticle = new HashMap<Long, String>();
		maparticle.put(1L, "BABY FOOD");
		maparticle.put(2L, "EXTRA BISCO");
		maparticle.put(3L, "NIVEA MAN");
		maparticle.put(4L, "DEEP NIVEA");
		maparticle.put(5L, "COCA COLA");
		maparticle.put(6L, "MUSCADOR");
		maparticle.put(7L, "PATTE DE BOXE");
		maparticle.put(8L, "33EXPORT");
		maparticle.put(9L, "CASTEL");
		maparticle.put(10L, "TEMBO");
		maparticle.put(11L, "CRYSTAL CLAIRE");
		maparticle.put(12L, "Q10 NIVEA");
		maparticle.put(13L, "Q10 DEEP NIVEA");
		maparticle.put(14L, "DOPEL");
		maparticle.put(15L, "SIMBA");
		maparticle.put(16L, "TURBO");
		maparticle.put(17L, "WIKA");
		maparticle.put(18L, "BOOM");
		maparticle.put(19L, "RADIO");
		maparticle.put(20L, "MOUFLE DE BOXE");
		for (Map.Entry mapentry : maparticle.entrySet()) {
			if (mapentry.getValue().equals("MUSCADOR"))
			System.out.println("cle:"+mapentry.getKey()
			+"valeur:"+ mapentry.getValue());
			


	}
	}
}
