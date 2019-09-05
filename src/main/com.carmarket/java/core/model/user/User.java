package core.model.user;

import java.util.concurrent.atomic.AtomicLong;

public class User {

    private static AtomicLong idCounter = new AtomicLong();

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId() {
        this.id = idCounter.getAndIncrement();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + '}' + "\n";
    }

}
