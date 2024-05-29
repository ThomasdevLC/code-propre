package ex2;

/**
 * Classe représentant un compte courant.
 * Hérite de la classe abstraite CompteBancaire.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur de la classe CompteCourant.
     *
     * @param solde le solde initial du compte
     * @param decouvert le découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde, decouvert);
    }
}
