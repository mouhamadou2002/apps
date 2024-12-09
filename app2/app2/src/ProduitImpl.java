import java.util.Scanner;

class ProduitImpl implements IProduit {

    @Override
    public Produit saisie() {
        // Code pour saisir les informations d'un produit depuis l'utilisateur
        // (par exemple, en utilisant un scanner)
        Produit produit = new Produit();
        System.out.print("Entrez la référence : ");
        produit.ref = new Scanner(System.in).nextLine();
        // ... et ainsi de suite pour les autres attributs
        return produit;
    }

    @Override
    public void affichage(Produit produit) {
        // Code pour afficher les informations d'un produit
        System.out.println("Référence : " + produit.ref);
        System.out.println("Libellé : " + produit.libelle);
        // ... et ainsi de suite pour les autres attributs
    }
}