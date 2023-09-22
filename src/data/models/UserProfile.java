package data.models;

public class UserProfile {
    private int id;
    private String firstName;
    private String lastname;
    private int age;
    private MenstrualCycle menstrualCycle;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MenstrualCycle getMenstrualCycle() {
        return menstrualCycle;
    }

    public void setMenstrualCycle(MenstrualCycle menstrualCycle) {
        this.menstrualCycle = menstrualCycle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
