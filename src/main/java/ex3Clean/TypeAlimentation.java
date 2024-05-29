package ex3Clean;

/**
 * Enumération représentant les différents types d'alimentation des animaux.
 */
public enum TypeAlimentation {
    /**
     * Type d'alimentation représentant les herbivores.
     */
    HERBIVORE("Herbivore"),

    /**
     * Type d'alimentation représentant les carnivores.
     */
    CARNIVORE("Carnivore");

    /**
     * Le nom du type d'alimentation.
     */
    private final String nom;

    /**
     * Constructeur de l'énumération TypeAlimentation.
     *
     * @param nom le nom du type d'alimentation
     */
    TypeAlimentation(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le nom du type d'alimentation.
     *
     * @return le nom du type d'alimentation
     */
    @Override
    public String toString() {
        return nom;
    }
}
