import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Plateau {
    public Integer x;
    public Integer y;
    public List<List<Case>> cases;

    /**
     * Construit un nouveau plateau
     *
     */
    public Plateau(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Initialise le plateau avec les dimensions indiquées
     */
    public static Plateau initPlateau(Integer x, Integer y){
        // création des cases

        // init plateau avec les dimensions des axes et les cases
        Plateau plateau = new Plateau(x, y);
        return plateau;
    }
}
