package model;

public class Argent implements ModeDePaiement  {

    // Attribut
    private double frais;

    // Constructeur complet
    public Argent(double frais) {
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
}
