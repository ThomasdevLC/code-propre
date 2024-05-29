package ex2;

/**
 * Classe abstraite représentant un compte bancaire.
 */
public abstract class CompteBancaire {

    /**
     * Le solde du compte.
     */
    protected double solde;

    /**
     * Le découvert autorisé du compte.
     */
    protected double decouvert;

    /**
     * Constructeur de la classe CompteBancaire.
     *
     * @param solde le solde initial du compte
     * @param decouvert le découvert autorisé
     */
    public CompteBancaire(double solde, double decouvert) {
        super();
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Ajoute un montant au solde du compte.
     *
     * @param montant le montant à ajouter
     */
    public final void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du compte si  découvert autorisé pas dépassé.
     *
     * @param montant le montant à débiter
     */
    public void debiterMontant(double montant) {
        if (this.solde - montant > decouvert) {
            this.solde = solde - montant;
        }
    }

    /**
     * Retourne le solde du compte.
     *
     * @return le solde du compte
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Modifie le solde du compte.
     *
     * @param solde le nouveau solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Retourne le découvert autorisé du compte.
     *
     * @return le découvert autorisé
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Modifie le découvert autorisé du compte.
     *
     * @param decouvert le nouveau découvert autorisé
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
