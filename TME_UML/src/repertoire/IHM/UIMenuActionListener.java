package repertoire.IHM;

import java.awt.event.ActionEvent;
import repertoire.IHM.JMenuItem;

public class UIMenuActionListener implements ActionListener {
     UIRepertoire uirep;

    public UIMenuActionListener(final UIRepertoire uirep) {
        super();
        this.uirep = uirep;
    }

    public void actionPerformed(final ActionEvent ev) {
        JMenuItem test = (JMenuItem) ev.getSource();
        if (test.getText() == "A Propos")
            System.out.println("Aide");
        else if (test.getText() == "Rechercher Personne(s)") {
            System.out.println("LOAD ");
        }
        else if (test.getText() == "Ajouter Nouvelle Personne") {
            System.out.println("Ajouter Nouvelle Personne ");
            Personne p = new Personne();
            uirep.getTheRepertoire().ajouterPersonne(p);
            uirep.refreshUIRepertoire();
        
        }
        else if (test.getText() == "Rechercher Personne(s)") {
            System.out.println("LOAD ");
        
        }
        else if (test.getText() == "Nouveau") {
            System.out.println("Nouveau ");
            uirep.setTheRepertoire(new Repertoire());
        }
        else if (test.getText() == "Enregistrer Sous") {
            System.out.println("LOAD ");
        
        }
        else if (test.getText() == "Enregistrer") {
            System.out.println("LOAD ");
        
        }
        else if (test.getText() == "Ouvrir") {
            System.out.println("LOAD ");
        
        }
    }

}
