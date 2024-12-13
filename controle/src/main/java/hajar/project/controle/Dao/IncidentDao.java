package hajar.project.controle.Dao;


import hajar.project.controle.model.Incident;

import java.util.List;

public interface IncidentDao {
    void ajouterIncident(Incident incident);
    List<Incident> getTousLesIncidents();
}