package pharmacie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DossierPharmacie {

	private String nom_pharmacie ;
	private HashMap<String , Patient > patients ;
	
	public DossierPharmacie( String n){
	nom_pharmacie =n;
	patients= new HashMap<String , Patient >();
	}
	
	public void nouveauPatient( String nom , HashSet<String > ord ){
		Patient p = new Patient(nom, ord);
		patients.put(nom ,p);
		}
	
	public void nouveauPatient( String nom ){
		Patient p = new Patient(nom);
		patients.put(nom.toLowerCase(),p);
		}
	
	public boolean ajoutMedicament ( String nom , String m){
		if(patients.containsKey(nom)) {
			Patient p=patients.get(nom);
			p.ajoutMedicament(m);
			return true;
		}else {
			return false;
		}
		}
	
	public void affichePatient( String nom ){
		Patient p=patients.get(nom);
		if( p!= null)
			p.affiche();
			else
			System.out.println("patient non existant");
		}
	
	public void affiche (){
		System.out.print("Nom du phar: "+nom_pharmacie);
		for(String i : patients.keySet()) {
			Patient k = patients.get(i);
			k.affiche();
		}
		}
	
	public void PatientAvecMedicament( String m){
		Collection<Patient> C = new ArrayList<Patient>();
		for(Patient i : patients.values()) {
			if(i.contientMedicament(m)) {
				C.add(i);
				i.affiche();
			}}
		}
	
	
	public void enleverPatientOrdonnanceVide()
	{
		Collection<Patient> c= patients.values();
		Iterator<Patient> it=c.iterator();
			while(it.hasNext())	{
				Patient p=it.next();
					if(p.ordonnanceVide())
						it.remove();}
		}
}
