package controller;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

//Controlleur qui controle l'application et son deroulement
public class ListeFacturesGraphicalController {

    ArrayList<Facture> listFactures;

    //Initialization de l'Application
    @FXML
    public void initialize()
    {

    }

    public void FillGridFacture(ArrayList<Facture> listFactures)
    {
        this.listFactures = listFactures;

        //TODO remplir la grille
    }
}
