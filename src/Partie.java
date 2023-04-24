public class Partie {
    public String joueur;
    public String plateau;

    /**
     * Crée une nouvelle partie avec le joueur et le plateau.
     */
    public Partie() {
        this.joueur = "Julie";
        this.plateau = "Plateau";
    }

    /**
     * Initialise la partie.
     */
    public void initialiserPartie(){
        System.out.println("Nouvelle partie. Bienvenue !");
    }
}
