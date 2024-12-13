package hajar.project.controle.Dao.Imp;

import hajar.project.controle.Dao.MembreDao;
import hajar.project.controle.model.Membre;

import java.util.ArrayList;
import java.util.List;

public class MembreDaoImpl implements MembreDao {
    private List<Membre> membres = new ArrayList<>();

    @Override
    public void ajouterMembre(Membre membre) {
        membres.add(membre);
        System.out.println("Membre ajouté : " + membre.getId());
    }

    @Override
    public List<Membre> getTousLesMembres() {
        return membres;
    }
}