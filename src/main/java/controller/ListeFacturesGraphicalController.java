package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

//Controlleur qui controle l'application et son deroulement
public class ListeFacturesGraphicalController {

    ArrayList<Facture> listFactures;

    @FXML
    private TableView<Facture> tableFactures;

    @FXML
    private TableColumn nom;

    @FXML
    private TableColumn modePaiement;

    @FXML
    private TableColumn totalSansTaxe;

    @FXML
    private TableColumn taxesApplicables;

    @FXML
    private TableColumn totalAvecTaxes;

    //Initialization de l'Application
    @FXML
    public void initialize()
    {

    }

    public void FillGridFacture(ArrayList<Facture> listFactures)
    {
        this.listFactures = listFactures;

        nom.setCellValueFactory(new PropertyValueFactory<>("nomDeLAcheteur"));
        modePaiement.setCellValueFactory(new PropertyValueFactory<>("modePaiement"));
        totalSansTaxe.setCellValueFactory(new PropertyValueFactory<>("totalSansTaxes"));
        taxesApplicables.setCellValueFactory(new PropertyValueFactory<>("taxesApplicables"));
        totalAvecTaxes.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.));

        for (Facture f : listFactures)
        {
            tableFactures.getItems().add(f);
        }
    }
}
