package repertoire.IHM;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import repertoire.Reste.Personne;
import repertoire.Reste.Repertoire;

public class UIRepertoire extends JFrame {
     Repertoire theRepertoire;
     
     ConcreteComposantG nbPersonneG;

     UIMenuActionListener menuListener;

     JMenuBar menu_barre;

     JMenuItem repertoire_menu_ouvrir;

     JMenuItem repertoire_menu_enregistrer;

     JMenuItem repertoire_menu_enregistrersous;

     JMenuItem repertoire_menu_nouveau;

     JMenuItem fonction_menu_ajouterPersonne;

     JMenuItem fonction_menu_rechercherPersonne;

     JMenuItem aide_menu_item;

     JSplitPane splitPane;

     JList repertoireView;

     UIPersonne uipersonne;

     JMenu repertoire_menu;

     JMenu fonction_menu;

     JMenu aide_menu;
     
     
    public Repertoire getTheRepertoire() {
        return theRepertoire;
    }

    public void setTheRepertoire(final Repertoire theRepertoire) {
        this.theRepertoire = theRepertoire;
        refreshUIRepertoire();
    }

    public UIRepertoire() {
        super("Mon Repertoire");
        theRepertoire = new Repertoire();
        nbPersonneG = new ConcreteComposantG();
        theRepertoire.registerComposantG(nbPersonneG);
        
        menuListener = new UIMenuActionListener(this);
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(l);
        init();
    }

    public UIRepertoire(Repertoire rep) {
        super("Mon Repertoire");
        theRepertoire = rep;
        nbPersonneG = new ConcreteComposantG();
        theRepertoire.registerComposantG(nbPersonneG);
        
        menuListener = new UIMenuActionListener(this);
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(l);
        init();
        refreshUIRepertoire();
    }

    void init() {
        //Barre de Menu 
        menu_barre = new JMenuBar();
        setJMenuBar(menu_barre);
        
        // Menu FICHIER
        repertoire_menu = new JMenu("Fichier");
        menu_barre.add(repertoire_menu);
        
        repertoire_menu_nouveau = new JMenuItem("Nouveau");
        repertoire_menu.add(repertoire_menu_nouveau);
        repertoire_menu_nouveau.addActionListener(menuListener);
        repertoire_menu_ouvrir = new JMenuItem("Ouvrir");
        repertoire_menu.add(repertoire_menu_ouvrir);
        repertoire_menu_ouvrir.addActionListener(menuListener);
        repertoire_menu_enregistrer = new JMenuItem("Enregistrer");
        repertoire_menu.add(repertoire_menu_enregistrer);
        repertoire_menu_enregistrer.addActionListener(menuListener);
        //fichier_menu_enregistrer.setMnemonic(KeyEvent.VK_S);
        repertoire_menu_enregistrersous = new JMenuItem("Enregistrer Sous");
        repertoire_menu.add(repertoire_menu_enregistrersous);
        repertoire_menu_enregistrersous.addActionListener(menuListener);
        
        // Menu FONCTION
        fonction_menu = new JMenu("Organisation");
        menu_barre.add(fonction_menu);
        
        fonction_menu_ajouterPersonne =
            new JMenuItem("Ajouter Nouvelle Personne");
        fonction_menu.add(fonction_menu_ajouterPersonne);
        fonction_menu_ajouterPersonne.addActionListener(menuListener);
        
        fonction_menu_rechercherPersonne =
            new JMenuItem("Rechercher Personne(s)");
        fonction_menu.add(fonction_menu_rechercherPersonne);
        fonction_menu_rechercherPersonne.addActionListener(menuListener);
        
        // Menu AIDE
        aide_menu = new JMenu("Aide");
        menu_barre.add(aide_menu);
        
        aide_menu_item = new JMenuItem("A Propos");
        aide_menu_item.addActionListener(menuListener);
        aide_menu.add(aide_menu_item);
        
        //Mettre un SplitPane
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        getContentPane().add(splitPane);
        
        setVisible(true);
        pack();
    }

    public void refreshUIRepertoire() {
        // Mettre la JList à gauche
        repertoireView = new JList(theRepertoire.listerPersonnes());
        repertoireView.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("Ok");
                Personne p = (Personne) repertoireView.getSelectedValue();
                uipersonne.setPersonne(p);
                
            }
        });
        splitPane.setLeftComponent(new JScrollPane(repertoireView));
        
        // create a new frame to stor text field and button 
        JFrame f = new JFrame("label"); 
        
        // create a panel 
        JPanel p = new JPanel(); 
        
        // add label to panel 
        p.add(this.nbPersonneG); 
  
        // add panel to frame 
        f.add(p); 
        f.setSize(300, 300); 
        
        //Test à droite
        if (theRepertoire.listerPersonnes().length!=0) {
            uipersonne = new UIPersonne(theRepertoire.listerPersonnes()[0]);
            splitPane.setRightComponent(uipersonne);
        }
    }

}