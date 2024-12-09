//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("Diallo", "Lamine");
        System.out.println("Nom: " + p.getNom() + " Prenom: " + p.getPrenom());
        Employe e = new Employe("Geomaticien",300000);
        e.setNom("Diallo");
        e.setPrenom("Mouhamadou");
        System.out.println("Employe: " + e.getNom() + " " + e.getPrenom() +
                ", Fonction " + e.getFonction() + ", Salaire: " + e.getSalaire());

        Etudiant etudiant = new Etudiant(12);
        etudiant.setNom("Sow");
        etudiant.setPrenom("Aminata");
        etudiant.genererMatricule();
        System.out.println("Etudiant: " + etudiant.getNom() + " " + etudiant.getPrenom() +
                ", Matricule: " + etudiant.getMatricule() + ", Moyenne: " + etudiant.getMoyenne());
    }
}