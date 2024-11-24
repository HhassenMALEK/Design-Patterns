package factory.model;

import factory.TypeUnit;

/**
 * Classe représentant une fabrique (Factory) pour la création d'unités humaines.
 * Cette classe est utilisée pour créer des instances spécifiques de types d'unités humaines
 * en fonction du type spécifié (par exemple, SOLDIER, COMMANDER, MEDIC).>
 */
public class HumanFactory {

    /**
     * Crée une unité humaine en fonction du type spécifié.
     * Cette méthode utilise un switch pour déterminer quel type d'unité créer en fonction de
     * l'énumération {@link TypeUnit}. Si le type est reconnu, une nouvelle instance de l'unité
     * correspondante est créée et retournée.
     *
     * @param type Le type de l'unité humaine à créer (SOLDIER, COMMANDER, MEDIC).
     * @return Une instance de {@link Human} correspondant au type spécifié, ou {@code null} si le type est inconnu.
     */
    public static Human createUnit(TypeUnit type) {
        switch(type) {
            case SOLDIER:
                return new Soldier();  // Crée une instance de Soldier
            case COMMANDER:
                return new Commander();  // Crée une instance de Commander
            case MEDIC:
                return new Medic();  // Crée une instance de Medic
            default:
                return null;  // Retourne null si le type est inconnu
        }
    }
}
