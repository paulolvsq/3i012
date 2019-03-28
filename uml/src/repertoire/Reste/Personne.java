package repertoire.Reste;


public class Personne {
     String nom;

     String prenom;

     String telephoneMaison;

     String telephonePortable;

     String telephoneBureau;

     String fax;

     String titre;

     String societe;

     String mail;

     Adresse adresse;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(final Adresse adresse) {
        this.adresse = adresse;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(final String mail) {
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(final String societe) {
        this.societe = societe;
    }

    public String getTelephoneBureau() {
        return telephoneBureau;
    }

    public void setTelephoneBureau(final String telephoneBureau) {
        this.telephoneBureau = telephoneBureau;
    }

    public String getTelephoneMaison() {
        return telephoneMaison;
    }

    public void setTelephoneMaison(final String telephoneMaison) {
        this.telephoneMaison = telephoneMaison;
    }

    public String getTelephonePortable() {
        return telephonePortable;
    }

    public void setTelephonePortable(final String telephonePortable) {
        this.telephonePortable = telephonePortable;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(final String titre) {
        this.titre = titre;
    }

    public String toString() {
        return nom+" "+prenom;
    }

}
