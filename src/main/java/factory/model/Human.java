package factory.model;

import factory.TypeUnit;

/**
 * Classe abstraite représentant une unité humaine générique.
 * <p>
 * Cette classe sert de base pour différents types d'unités humaines, telles que les soldats,
 * les commandants et les médecins. Elle définit des propriétés et des comportements communs
 * à toutes les unités humaines, tels que le type, le nom, la construction et les ressources.
 * </p>
 */
public abstract class Human {

    /**
     * Le type de l'unité humaine, qui peut être un soldat, un commandant, un médecin, etc.
     * Ce champ est défini par l'énumération {@link TypeUnit}.
     */
    protected TypeUnit type;

    /**
     * Le nom de l'unité humaine.
     * Ce champ peut être utilisé pour nommer l'unité.
     */
    protected String name;

    /**
     * La valeur représentant la construction de l'unité humaine.
     * Cela peut représenter des caractéristiques spécifiques de l'unité,
     * telles que sa résistance ou sa capacité de construction.
     */
    protected Integer construction;

    /**
     * Le nombre de ressources associées à l'unité humaine.
     * Cela peut représenter des points de vie, de l'énergie ou d'autres ressources importantes.
     */
    protected Integer resources;

    /**
     * Getter pour obtenir le type de l'unité humaine.
     * Cette méthode retourne le type spécifique de l'unité, comme SOLDIER, COMMANDER, ou MEDIC.
     *
     * @return Le type de l'unité humaine.
     */
    public TypeUnit getType() {
        return type;
    }

}
