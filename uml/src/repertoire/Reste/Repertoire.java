package repertoire.Reste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import repertoire.IHM.Observer;

public class Repertoire implements Subject {
     ArrayList<Personne> personnes;

    public void ajouterPersonne(final Personne p) {
        personnes.add(p);
        notifyComposantG();
    }

    public void supprimerPersonne(final Personne p) {
        personnes.remove(p);
        notifyComposantG();
    }

    public Personne[] rechercherPersonnesParNom(final String nom) {
        ArrayList <Personne> success = new ArrayList<Personne>();
        for (Iterator it = personnes.iterator() ; it.hasNext();) {
            Personne current = (Personne) it.next();
            if (current.getNom().compareTo(nom)==0) success.add(current);
        }
        Personne[] res = new Personne[0];
        return (Personne[]) success.toArray(res);
    }

    public Personne[] listerPersonnes() {
        Personne[] res = new Personne[0];
        return personnes.toArray(res);
    }

    public Repertoire() {
        personnes = new ArrayList<Personne>();
    }

	@Override
	public List<Observer> observers() {
		return listObservers;
	}

	@Override
	public void registerComposantG(Observer cg) {
		listObservers.add(cg);
	}

	@Override
	public void unregisterComposantG(Observer cg) {
		listObservers.remove(cg);
		
	}

	@Override
	public void notifyComposantG() {
		for (Observer o: listObservers) o.update(personnes.size());
	}
    

}
