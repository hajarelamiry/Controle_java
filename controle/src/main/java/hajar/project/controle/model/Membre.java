package hajar.project.controle.model;
import lombok.Data;

import java.util.Objects;

@Data
public class Membre {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String phone;

    public Membre(String id, String nom, String prenom, String email, String phone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membre membre = (Membre) o;
        return Objects.equals(id, membre.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

