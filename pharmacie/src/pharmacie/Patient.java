package pharmacie;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Patient {
	private String nom ;
	private Set <String > ordonnance ;
	
	public Patient ( String n ,HashSet<String > HS ){
		nom = n;
		ordonnance = new HashSet<String >(HS);
		}
	
	public Patient ( String n){
	nom = n;
	ordonnance = new HashSet<String >();
	}
	
	public String getNom () { return nom ;}

	
	public boolean ordonnanceVide (){
		return ordonnance.isEmpty();
		}
	
	public void ajoutMedicament( String m) {
		ordonnance.add(m);
		}
	
	public void affiche (){
		System.out.print("\n \n Nom: "+nom+"\n Liste des med: ");
		Iterator<String> it = ordonnance.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		}
	
	public boolean contientMedicament (String m) {
		return ordonnance.contains(m);
		}
		

}
