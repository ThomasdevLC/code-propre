package ex3Clean;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe abstraite Zone représente une zone contenant des animaux.
 */
public abstract class Zone {
    /**
     * La liste des animaux dans la zone.
     */
    protected List<Animal> animaux = new ArrayList<>();

    /**
     * Ajoute un animal à la zone.
     *
     * @param animal l'animal à ajouter
     */
    public abstract void addAnimal(Animal animal);

    /**
     * Affiche la liste des animaux dans la zone.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour tous les animaux dans la zone.
     *
     * @param poidsParAnimal le poids de nourriture nécessaire par animal par jour
     * @return la quantité totale de nourriture nécessaire par jour pour tous les animaux dans la zone
     */
    public double calculerKgsNourritureParJour(double poidsParAnimal) {
        return animaux.size() * poidsParAnimal;
    }
}
