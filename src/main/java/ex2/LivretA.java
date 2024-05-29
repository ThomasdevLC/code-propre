package ex2;

/**
 * Classe représentant un Livret A.
 * Hérite de la classe abstraite CompteBancaire.
 */
public class LivretA extends CompteBancaire {

    /**
     *  taux de rémunération du Livret A.
     */
    private double tauxRemuneration;

    /**
     * Constructeur de la classe LivretA.
     *
     * @param solde  solde  du compte
     * @param tauxRemuneration  taux de rémunération 
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Applique la rémunération  au solde du Livret A.
     */
    public void appliquerRemuAnnuelle() {
        this.solde = solde + solde * tauxRemuneration / 100.0;
    }

    /**
     * Retourne le taux de rémunération du Livret A.
     *
     * @return le taux de rémunération
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Modifie le taux de rémunération du Livret A.
     *
     * @param tauxRemuneration  nouveau taux de rémunération
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
