package hajar.project.controle.Dao.Imp;
import hajar.project.controle.Dao.IncidentDao;
import hajar.project.controle.model.Incident;
import java.util.ArrayList;
import java.util.List;
public class IncidentDaoImp implements IncidentDao {


        private List<Incident> incidents = new ArrayList<>();

        @Override
        public void ajouterIncident(Incident incident) {
            incidents.add(incident);
            System.out.println("Incident ajouté : " + incident.getReference());
        }

        @Override
        public List<Incident> getTousLesIncidents() {
            return incidents;
        }


}
