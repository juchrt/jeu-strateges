import java.util.Scanner;

public class Joueur {
    public String nom;
    public Coffre coffre;

    /**
     * Crée un nouveau joueur avec son nom et en initialisant son coffre
     *
     * @param nom Le nom du joueur
     * @param coffre Le coffre du joueur
     */
    public Joueur(String nom, Coffre coffre) {
        this.nom = nom;
        this.coffre = coffre;
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

        // création du coffre
        Coffre coffre = new Coffre();
        coffre.initCoffre();
        
        // init joueur avec le nom et son coffre
        Joueur joueur = new Joueur(nom, coffre);
        return joueur;
    }
}