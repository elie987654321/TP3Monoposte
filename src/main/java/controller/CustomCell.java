package controller;

import javafx.scene.control.Cell;
import javafx.scene.control.TableCell;
import model.Facture;

public class CustomCell extends Cell
{

    protected void updateItem(Facture facture, boolean empty)
    {
        super.updateItem(facture, empty);

        if(facture == null)
        {
            setText(null);
        }
        else
        {
            setText(facture.getModeDePaiement().toString());
        }
    }
}
