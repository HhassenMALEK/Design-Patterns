package factory.model;

import factory.TypeUnit;

/**
 * Classe représentant un médecin, qui est un type spécifique d'unité humaine.
 * Cette classe hérite de la classe {@link Human} et définit les propriétés spécifiques
 * au médecin, comme son type et ses ressources.
 */
public class Medic extends Human {

    /**
     * Constructeur de la classe {@link Medic}.
     * Ce constructeur initialise l'objet médecin avec le type correspondant à un médecin
     * et définit un nombre de ressources spécifique.
     */
    public Medic() {
        // Initialisation du type de l'unité à MEDIC
        type = TypeUnit.MEDIC;

        // Initialisation des ressources à 50
        resources = 50;
    }
}
