package repertoire;

import java.util.ArrayList;
import java.util.Iterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4f1c0934-0401-424c-ae47-ee3064516382")
public class Repertoire {
    @objid ("02a2b7d7-253c-4945-ba80-170c6dc4b71d")
     ArrayList<Personne> personnes;

    @objid ("41ad2ec6-ee59-4759-a1ac-ea25baffe1ad")
    public void ajouterPersonne(Personne p) {
        personnes.add(p);
    }

    @objid ("afc0da4c-280c-4f19-8c2b-48e731800763")
    public void supprimerPersonne(Personne p) {
        personnes.remove(p);
    }

    @objid ("21643df2-dc7c-4dfa-ba47-4002f51e6f71")
    public Personne[] rechercherPersonnesParNom(String nom) {
        ArrayList <Personne> success = new ArrayList<Personne>();
        for (Iterator it = personnes.iterator() ; it.hasNext();) {
            Personne current = (Personne) it.next();
            if (current.getNom().compareTo(nom)==0) success.add(current);
        }
        Personne[] res = new Personne[0];
        return (Personne[]) success.toArray(res);
    }

    @objid ("9f1d4f9a-0e09-4fc7-9eec-85feab747d91")
    public Personne[] listerPersonnes() {
        Personne[] res = new Personne[0];
        return personnes.toArray(res);
    }

    @objid ("48459b2e-f9a1-455d-9d7c-d70d654cb2a9")
    public Repertoire() {
        personnes = new ArrayList<Personne>();
    }

}
