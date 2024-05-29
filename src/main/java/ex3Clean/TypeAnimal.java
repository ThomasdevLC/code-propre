package ex3Clean;

/**
 * Enumération représentant les différents types d'animaux.
 */
public enum TypeAnimal {
    /**
     * Type animal représentant les mammifères.
     */
    MAMMIFERE("Mammifère"),

    /**
     * Type animal représentant les poissons.
     */
    POISSON("Poisson"),

    /**
     * Type animal représentant les serpents.
     */
    SERPENT("Serpent");

    /**
     * Le nom du type d'animal.
     */
    private final String nom;

    /**
     * Constructeur de l'énumération TypeAnimal.
     *
     * @param nom le nom du type d'animal
     */
    TypeAnimal(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le nom du type d'animal.
     *
     * @return le nom du type d'animal
     */
    @Override
    public String toString() {
        return nom;
    }
}
