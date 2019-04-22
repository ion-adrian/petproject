package net.comdava.petproject.model;

public class Person extends net.comdava.petproject.model.BaseEntity {
    private String firstName;
    private String lastName;

    // getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    // setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
}
