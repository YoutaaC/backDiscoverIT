package project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class LikesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String body;
    private String mini_body;
    private String type;
    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean isConfirmed;
    @Temporal(TemporalType.DATE)
    private Date created;
}
