package ex3Clean;

public class ZooApplication {

    public static void main(String[] args) {
        // Création d'une instance de Zoo
        Zoo zoo = new Zoo("Zoo de la Ville");

        // Ajout d'animaux au zoo avec spécification des zones
        zoo.addAnimal("Savane", new Animal("Lion", TypeAnimal.MAMMIFERE, TypeAlimentation.CARNIVORE));
        zoo.addAnimal("Savane", new Animal("Éléphant", TypeAnimal.MAMMIFERE, TypeAlimentation.HERBIVORE));
        zoo.addAnimal("Reptiles", new Animal("Python", TypeAnimal.SERPENT, TypeAlimentation.CARNIVORE));
        zoo.addAnimal("Reptiles", new Animal("Iguane", TypeAnimal.SERPENT, TypeAlimentation.HERBIVORE));
        zoo.addAnimal("Aquarium", new Animal("Poisson rouge", TypeAnimal.POISSON, TypeAlimentation.HERBIVORE));
        zoo.addAnimal("Aquarium", new Animal("Requin", TypeAnimal.POISSON, TypeAlimentation.HERBIVORE));


        // Affichage de la liste des animaux du zoo
        zoo.afficherListeAnimaux();
        
        double poidsParAnimal = 0.2; // poids moyen d'un poisson
        double nourritureParJourAquarium = zoo.getZoneAquarium().calculerKgsNourritureParJour(poidsParAnimal);
        System.out.println("Quantité de nourriture nécessaire par jour dans la zone de l'aquarium: " + nourritureParJourAquarium + " kg");

      
    }
}
