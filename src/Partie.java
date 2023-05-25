public class Partie {
    public Joueur joueur;
    public String plateau;

    /**
     * CrÃ©e une nouvelle partie avec le joueur et le plateau.
     */
    public Partie() {
        this.joueur = Joueur.initJoueur();
        this.plateau = "Plateau";
    }

    /**
     * Initialise la partie.
     */
    public void initialiserPartie(){
        System.out.println("Nouvelle partie. Bienvenue " + joueur.nom + " !");
        System.out.println("Votre coffre : " + joueur.coffre.toString());
    }
}