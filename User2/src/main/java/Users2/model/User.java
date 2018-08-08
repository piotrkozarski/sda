package Users2.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class User {

    @NotNull

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @NotEmpty
    @Size(min = 1, max = 30, message = "jakis message na min i max ilsc znakow")
    @Column(name = "LOGIN", length = 30)
    private String login;

    @NotEmpty
    @Column(name = "NAME", length = 30)
    private String name;

    @NotEmpty
    @Column(name = "LASTNAME", length = 50)
    private String lastName;

    @Past
    @Column(name = "CTIME")
    private LocalDateTime ctime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ctime=" + ctime +
                '}';
    }
}
