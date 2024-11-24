package factory.model;

import factory.TypeUnit;

/**
 * Classe représentant un commandant, qui est un type spécifique d'unité humaine.
 * <p>
 * Cette classe hérite de la classe {@link Human} et définit les propriétés spécifiques
 * au commandant, comme son type et ses ressources.
 * </p>
 */
public class Commander extends Human {

    /**
     * Constructeur de la classe {@link Commander}.
     * Ce constructeur initialise l'objet commandant avec le type correspondant à un commandant
     * et définit un nombre de ressources spécifique.
     */
    public Commander() {
        // Initialisation du type de l'unité à COMMANDER
        type = TypeUnit.COMMANDER;

        // Initialisation des ressources à 100
        resources = 100;
    }
}
