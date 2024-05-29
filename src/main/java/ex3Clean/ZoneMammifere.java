package ex3Clean;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe ZoneMammifere représente une zone spécifique pour les mammifères.
 */
public class ZoneMammifere {
    /**
     * La liste des animaux dans la zone des mammifères.
     */
    protected List<Animal> animaux = new ArrayList<>();

    /**
     * Ajoute un animal à la zone des mammifères.
     *
     * @param animal l'animal à ajouter
     */
    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux dans la zone des mammifères.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
        }
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour les animaux dans la zone des mammifères.
     *
     * @param poidsParAnimal le poids de nourriture nécessaire par animal par jour
     * @return la quantité totale de nourriture nécessaire par jour pour les animaux dans la zone des mammifères
     */
    public double calculerKgsNourritureParJour(double poidsParAnimal) {
        return animaux.size() * poidsParAnimal;
    }
}
