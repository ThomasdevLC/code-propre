package ex3Clean;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe ZoneAquarium représente une zone spécifique pour les animaux d'aquarium.
 */
public class ZoneAquarium {
    /**
     * La liste des animaux dans la zone de l'aquarium.
     */
    protected List<Animal> animaux = new ArrayList<>();

    /**
     * Ajoute un animal à la zone de l'aquarium.
     *
     * @param animal l'animal à ajouter
     */
    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux dans la zone de l'aquarium.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour les animaux dans la zone de l'aquarium.
     *
     * @param poidsParAnimal le poids de nourriture nécessaire par animal par jour
     * @return la quantité totale de nourriture nécessaire par jour pour les animaux dans la zone de l'aquarium
     */
    public double calculerKgsNourritureParJour(double poidsParAnimal) {
        return animaux.size() * poidsParAnimal;
    }
}
