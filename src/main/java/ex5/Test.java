package ex5;

public class Test {

		    public static void main(String[] args) {
		        // Création d'un inventaire
		        Inventaire inventaire = new Inventaire();

		        // Création d'articles
		        Item item1 = new Item();
		        item1.setNom("Livre");
		        item1.setPoids(3);

		        Item item2 = new Item();
		        item2.setNom("Ordinateur");
		        item2.setPoids(10);

		        Item item3 = new Item();
		        item3.setNom("Réfrigérateur");
		        item3.setPoids(30);

		        // Ajout des articles à l'inventaire
		        inventaire.addItem(item1);
		        inventaire.addItem(item2);
		        inventaire.addItem(item3);

		        
		        // Vérification de la taille de l'inventaire
		        System.out.println("Taille de l'inventaire : " + inventaire.taille());
		    }
		}
	


