package hajar.project.controle.Dao;
import hajar.project.controle.model.Membre;

import java.util.List;

public interface MembreDao {
    void ajouterMembre(Membre membre);
    List<Membre> getTousLesMembres();
}