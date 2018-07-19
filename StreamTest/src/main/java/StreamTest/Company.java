package StreamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    String companyName;
    Persons companyOwner;
    List<Address> departments;

    /*= new ArrayList<>(Arrays.asList(new Address("Poland", "Szczecin", "Wyszynskiego 5"),
            new Address("Poland", "Gdańsk", "Wojska Polskiego 3/5"),
            new Address("Poland", "Warszawa", "Aleje Jerozolskie 1")));
*/

    public Company(String companyName, Persons companyOwner, List<Address> departments) {
        this.companyName = companyName;
        this.companyOwner = companyOwner;
        this.departments = departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Persons getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(Persons companyOwner) {
        this.companyOwner = companyOwner;
    }

    public List<Address> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Address> departments) {
        this.departments = departments;
    }
}
