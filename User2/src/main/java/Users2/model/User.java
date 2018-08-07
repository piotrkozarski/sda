package Users2.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name="LOGIN", length=30)
    private String login;

    @Column(name = "NAME", length = 30 )
    private String name;

    @Column(name = "LASTNAME", length = 50)
    private String lastName;

    @Column(name = "CTIME")
    private LocalDateTime ctime;


}
