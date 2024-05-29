package ex3Clean;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe ZoneSavane représente une zone spécifique pour les animaux de la savane.
 */
public class ZoneSavane {
    /**
     * La liste des animaux dans la zone de la savane.
     */
    protected List<Animal> animaux = new ArrayList<>();

    /**
     * Ajoute un animal à la zone de la savane.
     *
     * @param animal l'animal à ajouter
     */
    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux dans la zone de la savane.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour les animaux dans la zone de la savane.
     *
     * @param poidsParAnimal le poids de nourriture nécessaire par animal par jour
     * @return la quantité totale de nourriture nécessaire par jour pour les animaux dans la zone de la savane
     */
    public double calculerKgsNourritureParJour(double poidsParAnimal) {
        return animaux.size() * poidsParAnimal;
    }
}
