package project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String tel;
    private String password;

    @Temporal(TemporalType.DATE)
    private Date creationDate;




    @OneToOne(mappedBy = "userEntity", cascade = CascadeType.ALL)
    private UserRole userRole;


    @JsonIgnore
    @OneToOne(mappedBy = "userEntity")
    private Image userImage;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<PostEntity> posts=new HashSet<>();
}
