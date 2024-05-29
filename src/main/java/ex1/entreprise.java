package ex1;

import java.util.Date;

/**
 * La classe Entreprise représente une entreprise avec ses informations .
 */
public class entreprise {

    /**
     * Le numéro SIRET de l'entreprise.
     */
    public int siret;
    
    /**
     * Le nom de l'entreprise.
     */
    public String nom;
    
    /**
     * L'adresse de l'entreprise.
     */
    public String adresse;
    
    /**
     * La date de création de l'entreprise.
     */
    public Date dateCreation;
    
    /**
     * Le capital maximum de l'entreprise.
     */
    public static final int CAPITAL_MAX = 3000000;
    
    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
    }
}
