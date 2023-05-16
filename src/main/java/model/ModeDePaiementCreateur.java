package model;

public class ModeDePaiementCreateur {

    public static ModeDePaiement creerModeDePaiement(String nom, double frais)
    {
        switch (nom) {
            case "Argent":
                return new Argent(frais);
            case "Debit":
                return new Debit(frais);
            case "Credit":
                return new Credit(frais);
            default:
                return null;
        }
    }
}
