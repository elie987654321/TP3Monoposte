package model;

import java.text.DecimalFormat;
import java.util.*;


public class Comptable {

    // Attributs
    private double totalDesDons;
    private HashMap<String, ModeDePaiement> modePaiements;

    // Constructeur par défaut
    public Comptable() {
        this.totalDesDons = 0.00;
        this.modePaiements = new HashMap<String, ModeDePaiement>();
    }

     // Accesseurs et mutateurs
    public HashMap<String, ModeDePaiement> getModePaiements() {
        return modePaiements;
    }

    public void setModePaiements(HashMap<String, ModeDePaiement> modePaiements) {
        this.modePaiements = modePaiements;
    }

    public double getTotalDesDons() {
        return totalDesDons;
    }

    public void setTotalDesDons(double totalDesDons) {
        this.totalDesDons = totalDesDons;
    }

    // Methodes
    public Facture creerUneFacture(){
        return new Facture();
    }

    public void CreerModesPaiements()
    {
        modePaiements.put("argent", ModeDePaiementCreateur.creerModeDePaiement( "Argent", 0));
        modePaiements.put("debit" , ModeDePaiementCreateur.creerModeDePaiement("Debit", 0.01));
        modePaiements.put("credit", ModeDePaiementCreateur.creerModeDePaiement( "Credit", 0.03));
    }

    public void AjouterFactureATotalDon(Facture facture)
    {
        this.totalDesDons += CalculerDonFacture(facture);
    }

    public double CalculerDonFacture(Facture facture)
    {
        if (facture.getTotalAvecTaxes() > 0){
            double caluclDon =  ModeDePaiement.POURCENTAGE * (facture.getTotalAvecTaxes() - (facture.getTotalAvecTaxes() *  facture.getModeDePaiement().getFrais()));

            DecimalFormat df = new DecimalFormat("#.##");
            String formattedNumber = df.format(caluclDon);
            formattedNumber = formattedNumber.replace("," , ".");
            double montantArrondi = Double.parseDouble(formattedNumber);

            return montantArrondi;

        }else {
            return 0.00;
        }
    }
}
