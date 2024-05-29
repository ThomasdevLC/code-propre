package ex3Clean;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe ZoneCarnivore représente une zone spécifique pour les animaux carnivores.
 */
public class ZoneCarnivore {
    /**
     * La liste des animaux dans la zone carnivore.
     */
    protected List<Animal> animaux = new ArrayList<>();

    /**
     * Ajoute un animal à la zone carnivore.
     *
     * @param animal l'animal à ajouter
     */
    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux dans la zone carnivore.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour les animaux dans la zone carnivore.
     *
     * @param poidsParAnimal le poids de nourriture nécessaire par animal par jour
     * @return la quantité totale de nourriture nécessaire par jour pour les animaux dans la zone carnivore
     */
    public double calculerKgsNourritureParJour(double poidsParAnimal) {
        return animaux.size() * poidsParAnimal;
    }
}
