package Users2.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Region {

    @NotNull

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "regions")
    private Set<User> userList = new HashSet<>();

    @NotEmpty
    @Column(name = "REGION_NAME", length = 30)
    private String regionName;

    @Past
    @Column(name = "CTIME")
    private LocalDateTime ctime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }

    public Set<User> getUserList() {
        return userList;
    }

    public void setUserList(Set<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", regionName='" + regionName + '\'' +
                ", ctime=" + ctime +
                '}';
    }
}
