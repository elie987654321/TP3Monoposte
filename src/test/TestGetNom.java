import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.*;

public class TestGetNom {

    @Test
    public void etantDonneeNouvelleFacture_quandOnMetLeModeDePaiementAArgent_alorsRetourneChaineArgent()
    {
        Facture facture = new Facture();

        facture.setModeDePaiement(ModeDePaiementCreateur.creerModeDePaiement("Argent", 2));

        Assertions.assertEquals("Argent", facture.getNomModePaiement());
    }

    @Test
    public void etantDonneeNouvelleFacture_quandOnMetLeModeDePaiementACredit_alorsRetourneChaineCredit()
    {
        Facture facture = new Facture();

        facture.setModeDePaiement(ModeDePaiementCreateur.creerModeDePaiement("Credit", 2));

        Assertions.assertEquals("Credit", facture.getNomModePaiement());
    }

    @Test
    public void etantDonneeNouvelleFacture_quandOnMetLeModeDePaiementADebit_alorsRetourneChaineDebit()
    {
        Facture facture = new Facture();

        facture.setModeDePaiement(ModeDePaiementCreateur.creerModeDePaiement("Debit", 2));

        Assertions.assertEquals("Debit", facture.getNomModePaiement());
    }
}
