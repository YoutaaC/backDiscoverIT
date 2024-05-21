package project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String mini_body;
    private String body;
    private String type;
    private String categorie;
    private String lieu;
    private String time;
    private String capacite_max;
    private String jour_debut;
    private String mois_debut;
    private String annee_debut;
    private String date_fin;
    private Double prix;
    @Temporal(TemporalType.DATE)
    private Date created;
}
