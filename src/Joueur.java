import java.util.Scanner;

public class Joueur {
    public String nom;
    public String coffre;

    /**
     * Crée un nouveau joueur avec son nom et en initialisant son coffre
     *
     * @param nom Le nom du joueur
     */
    public Joueur(String nom) {
        this.nom = nom;
        this.coffre = "coffre";
    }

    /**
     * Cette fonction permet d'initialiser le joueur.
     * Saisie du nom.
     *
     * @return joueur
     */
    public static Joueur initJoueur(){
        // récupère le pseudo de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre pseudo ? ");
        System.out.flush();
        String nom = scanner.nextLine();
        scanner.close();
        
        // init joueur avec le nom
        Joueur joueur = new Joueur(nom);
        return joueur;
    }
}
