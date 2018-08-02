package pl.sda.model;

import pl.sda.model.Addresses;

import java.time.LocalDateTime;

public class User {
    private String firstName;
    private String lastName;
    private String company;
    private Addresses address;
    private String phone;
    private String fax;
    private String email;
    private String web;
    private boolean isActive;
    private LocalDateTime ctime = LocalDateTime.now();
    private LocalDateTime mtime = LocalDateTime.now();
    private String login;
    private String password;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Addresses getAddress() {
        return address;
    }

    public void setAddress(Addresses address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFax(){
        return fax;
    }
    public void setFax(String fax){
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public boolean getIsActive() {
        return isActive = true;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }
}
