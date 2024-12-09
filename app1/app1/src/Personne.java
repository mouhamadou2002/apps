public class Personne {
    protected String nom;
    protected String prenom;

    public Personne(){
    }
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void saisie() {
        System.out.println("Saisie des informations pour une personne.");
    }

}
