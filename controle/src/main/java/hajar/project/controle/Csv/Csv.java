package hajar.project.controle.Csv;
import hajar.project.controle.model.Membre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
public class Csv {
        public static Set<Membre> chargerListeMembre(String nomFichier) {
            Set<Membre> membres = new HashSet<>();
            try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
                String ligne;
                while ((ligne = br.readLine()) != null) {
                    String[] details = ligne.split(",");
                    if (details.length == 4) {
                        String id = UUID.randomUUID().toString();
                        Membre membre = new Membre(id, details[0], details[1], details[2], details[3]);
                        membres.add(membre);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return membres;
        }


}
