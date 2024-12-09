public class Etudiant extends Personne{
    private String matricule;
    private double moyenne;

    public Etudiant(){
    }

    public Etudiant(double moyenne ){
        this.moyenne = moyenne;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public double getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    public void genererMatricule(){
        System.out.println("Matricule: " + matricule);
    }
}
