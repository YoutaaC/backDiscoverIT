package project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomUser;
    private String prenomUser;
    private String emailUser;
    private String objet;
    private String message;
    @Temporal(TemporalType.DATE)
    private Date created;
}
