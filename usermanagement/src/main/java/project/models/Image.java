package project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Lob
    @Column(name = "picByte",columnDefinition = "LONGBLOB")
    byte[] picByte;

    @OneToOne
    @JoinTable(name="user_image_assoiation")
    private UserEntity userEntity;

    @OneToOne
    @JoinTable(name="post_image_assoiation")
    private PostEntity postEntity;

    @OneToOne
    @JoinTable(name="event_image_assoiation")
    private EventEntity eventEntity;
}
