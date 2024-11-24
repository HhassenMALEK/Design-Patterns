package factory.model;

import factory.TypeUnit;

/**
 * Classe représentant un soldat, qui est un type spécifique d'unité humaine.
 * Cette classe hérite de la classe {@link Human} et définit les propriétés spécifiques
 * au soldat, comme son type et ses ressources.
 */
public class Soldier extends Human {

    /**
     * Constructeur de la classe {@link Soldier}.
     * Ce constructeur initialise l'objet soldat avec le type correspondant à un soldat
     * et définit un nombre de ressources spécifique.
     */
    public Soldier() {
        // Initialisation du type de l'unité à SOLDIER
        type = TypeUnit.SOLDIER;

        // Initialisation des ressources à 50
        resources = 50;
    }
}
