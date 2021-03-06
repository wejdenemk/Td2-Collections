package pharmacie;

import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		
		HashSet<String> list1 = new HashSet<String >();
		list1.add("med1");
		list1.add("vitamineE");
		
		HashSet<String> list2 = new HashSet<String >();
		
		HashSet<String> list3 = new HashSet<String >();
		list3.add("vitamineE");
		list3.add("med4");
		
		DossierPharmacie DP = new DossierPharmacie("Pharmacie1");
		DP.nouveauPatient("patient1", list1);
		DP.nouveauPatient("patient2", list2);
		DP.nouveauPatient("patient3", list3);
		System.out.print("\n AffichePharmacie ******** \n\n");
		DP.affiche();
		System.out.print("\n\n PatientAvecMedicament ******** ");
		DP.PatientAvecMedicament("vitamineE");
		System.out.print("\n\n AjoutMedicament ******** \n\n");
		System.out.println(DP.ajoutMedicament("patient1","Doliprane"));
		System.out.print("\n\n AffichePatient ******** ");
		DP.affichePatient("patient1");
		System.out.print("\n\n EnleverPatientOrdonnanceVide ******** \n\n");
		DP.enleverPatientOrdonnanceVide();
		DP.affiche();
	}
	
}
