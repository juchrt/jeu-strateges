public class Partie {
    public Joueur joueur;
    public Plateau plateau;

    /**
     * Crée une nouvelle partie avec le joueur et le plateau.
     */
    public Partie() {
        this.joueur = Joueur.initJoueur();
        this.plateau = Plateau.initPlateau(4,4);
    }

    /**
     * Initialise la partie.
     */
    public void initialiserPartie(){
        System.out.println("Nouvelle partie. Bienvenue " + joueur.nom + " !");
        System.out.println("Votre coffre : " + joueur.coffre.toString());
    }

    /**
     * Déroulé de la partie.
     */
    public void deroulePartie(){
        // si le joueur a encore de la nourriture

    }
}