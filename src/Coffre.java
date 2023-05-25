import java.util.HashMap;
import java.util.Map;

public class Coffre {
    public Map<TypeRessource,Integer> ressources;

    /**
     * Construit un nouveau coffre
     *
     */
    public Coffre() {
        this.ressources = new HashMap<>();
    }

    /**
     * Initialise le coffre avec tous les types de ressources à 0
     */
    public void initCoffre(){
        for (TypeRessource typeRessource : TypeRessource.values()) {
            this.ressources.put(typeRessource, 0);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<TypeRessource,Integer> ressource : this.ressources.entrySet()) {
            result.append(ressource.getKey())
                    .append(":")
                    .append(ressource.getValue())
                    .append("   ");
        }

        return result.toString();
    }
}
