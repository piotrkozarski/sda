package FirstMongoDb;

public class Users {
    private String login;
    private String name;
    private String lastName;
    private int age;

    public Users(String login, String name, String lastName, int age) {
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
