package ex3Clean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * La classe Zoo représente un zoo contenant des animaux répartis dans différentes zones.
 */
public class Zoo {

    private String nom;
    private List<Animal> animaux;
    private Map<String, List<Animal>> zones;
    private ZoneMammifere zoneMammifere;
    private ZoneReptile zoneReptile;
    private ZoneAquarium zoneAquarium;
    private ZoneCarnivore zoneCarnivore;
    private ZoneSavane zoneSavane;

    /**
     * Constructeur de la classe Zoo.
     *
     * @param nom le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
        this.zones = new HashMap<>();
        this.zoneMammifere = new ZoneMammifere();
        this.zoneReptile = new ZoneReptile();
        this.zoneAquarium = new ZoneAquarium();
        this.zoneCarnivore = new ZoneCarnivore();
        this.zoneSavane = new ZoneSavane();
    }

    /**
     * Retourne le nom du zoo.
     *
     * @return le nom du zoo
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom du zoo.
     *
     * @param nom le nouveau nom du zoo
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne la zone Aquarium du zoo.
     *
     * @return la zone Aquarium
     */
    public ZoneAquarium getZoneAquarium() {
        return zoneAquarium;
    }

    /**
     * Ajoute un animal au zoo et le place dans la zone appropriée.
     *
     * @param zone   le nom de la zone où ajouter l'animal
     * @param animal l'animal à ajouter
     */
    public void addAnimal(String zone, Animal animal) {
        animaux.add(animal);

        // Ajoute l'animal à la zone appropriée
        if (!zones.containsKey(zone)) {
            zones.put(zone, new ArrayList<>());
        }
        zones.get(zone).add(animal);

        // Vérifie le type d'animal et l'ajoute à la zone correspondante
        switch (animal.getType()) {
            case MAMMIFERE:
                zoneMammifere.ajouterAnimal(animal);
                break;
            case SERPENT:
                zoneReptile.ajouterAnimal(animal);
                break;
            case POISSON:
                zoneAquarium.ajouterAnimal(animal);
                break;
            default:
                zoneSavane.ajouterAnimal(animal);
                break;
        }
    }

    /**
     * Affiche la liste des animaux dans le zoo, classés par zone.
     */
    public void afficherListeAnimaux() {
        System.out.println("Liste des animaux du zoo " + nom + ":");
        for (List<Animal> animals : zones.values()) {
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
        // Affiche les animaux dans les zones spécifiques
        System.out.println("Animaux dans la zone Mammifère:");
        zoneMammifere.afficherListeAnimaux();
        System.out.println("Animaux dans la zone Reptile:");
        zoneReptile.afficherListeAnimaux();
        System.out.println("Animaux dans la zone Aquarium:");
        zoneAquarium.afficherListeAnimaux();
        System.out.println("Animaux dans la zone Carnivore:");
        zoneCarnivore.afficherListeAnimaux();
        System.out.println("Animaux dans la zone Savane:");
        zoneSavane.afficherListeAnimaux();
    }
}


