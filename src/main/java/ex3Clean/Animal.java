package ex3Clean;

/**
 * La classe Animal représente un animal avec un nom, un type et une alimentation.
 */
public class Animal {
    // Attributs
    /**
     * Le nom de l'animal.
     */
    private String nom;

    /**
     * Le type de l'animal (par exemple, mammifère, oiseau, etc.).
     */
    private TypeAnimal type;

    /**
     * L'alimentation de l'animal (par exemple, carnivore, herbivore, etc.).
     */
    private TypeAlimentation alimentation;

    // Constructeurs
    /**
     * Constructeur par défaut.
     * Crée une instance de la classe Animal sans initialiser les attributs.
     */
    public Animal() {
    }

    /**
     * Constructeur avec paramètres.
     * Crée une instance de la classe Animal avec les attributs spécifiés.
     *
     * @param nom Le nom de l'animal.
     * @param type Le type de l'animal.
     * @param alimentation L'alimentation de l'animal.
     */
    public Animal(String nom, TypeAnimal type, TypeAlimentation alimentation) {
        this.nom = nom;
        this.type = type;
        this.alimentation = alimentation;
    }

    // Getters et Setters
    /**
     * Obtient le nom de l'animal.
     *
     * @return Le nom de l'animal.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'animal.
     *
     * @param nom Le nom de l'animal.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient le type de l'animal.
     *
     * @return Le type de l'animal.
     */
    public TypeAnimal getType() {
        return type;
    }

    /**
     * Définit le type de l'animal.
     *
     * @param type Le type de l'animal.
     */
    public void setType(TypeAnimal type) {
        this.type = type;
    }

    /**
     * Obtient l'alimentation de l'animal.
     *
     * @return L'alimentation de l'animal.
     */
    public TypeAlimentation getAlimentation() {
        return alimentation;
    }

    /**
     * Définit l'alimentation de l'animal.
     *
     * @param alimentation L'alimentation de l'animal.
     */
    public void setAlimentation(TypeAlimentation alimentation) {
        this.alimentation = alimentation;
    }

   
    
}
 
       
