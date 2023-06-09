package model;

public class Debit implements ModeDePaiement {

    // Attribut
    private double frais;

    // Constructeur complet
    public Debit(double frais) {
        this.frais = frais;
    }

    // Accesseurs et mutateurs
    @Override
    public double getFrais() {
        return frais;
    }

    @Override
    public void setFrais(double frais) {
        this.frais = frais;
    }

    @Override
    public String getNom() {return "Debit";}
}
