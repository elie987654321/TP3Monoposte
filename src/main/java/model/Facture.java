package model;

public class Facture {

    // Attributs
    private String nomDeLAcheteur;
    private ModeDePaiement modeDePaiement;
    private double totalSansTaxes;
    private double taxesApplicables;
    private double totalAvecTaxes;

    // Constructeur par défaut
    public Facture(){

    }

    // Constructeur avec paramètres
    public Facture(String nomDeLAcheteur, ModeDePaiement modeDePaiement, double totalSansTaxes, double taxesApplicables) {
        this.nomDeLAcheteur = nomDeLAcheteur;
        this.modeDePaiement = modeDePaiement;
        this.totalSansTaxes = totalSansTaxes;
        this.taxesApplicables = taxesApplicables;
        this.totalAvecTaxes = totalSansTaxes + taxesApplicables;
    }

    // Accesseurs et mutateurs
    public String getNomDeLAcheteur() {
        return nomDeLAcheteur;
    }

    public void setNomDeLAcheteur(String nomDeLAcheteur) {
        this.nomDeLAcheteur = nomDeLAcheteur;
    }

    public ModeDePaiement getModeDePaiement() {
        return modeDePaiement;
    }

    public void setModeDePaiement(ModeDePaiement modeDePaiement) {
        this.modeDePaiement = modeDePaiement;
    }

    public double getTotalSansTaxes() {
        return totalSansTaxes;
    }

    public void setTotalSansTaxes(double totalSansTaxes) {
        this.totalSansTaxes = totalSansTaxes;
    }

    public double getTaxesApplicables() {
        return taxesApplicables;
    }

    public void setTaxesApplicables(double taxesApplicables) {
        this.taxesApplicables = taxesApplicables;
    }

    public double getTotalAvecTaxes() {
        return totalAvecTaxes;
    }

    public void setTotalAvecTaxes(double totalAvecTaxes) {
        this.totalAvecTaxes = totalAvecTaxes;
    }

}
