package hajar.project.controle.Controller;
import hajar.project.controle.Dao.Imp.MembreDaoImpl;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import hajar.project.controle.model.Membre;

import java.util.UUID;
public class IhmController {
        @FXML private TextField nomField;
        @FXML private TextField prenomField;
        @FXML private TextField emailField;
        @FXML private TextField phoneField;
        @FXML private Button ajouterButton;

        private MembreDaoImpl membreDao = new MembreDaoImpl();

        @FXML
        private void initialize() {
            ajouterButton.setOnAction(event -> {
                String id = UUID.randomUUID().toString();
                String nom = nomField.getText();
                String prenom = prenomField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();

                Membre nouveauMembre = new Membre(id, nom, prenom, email, phone);
                membreDao.ajouterMembre(nouveauMembre);
                System.out.println("Membre ajouté avec succès !");
            });
        }


}
