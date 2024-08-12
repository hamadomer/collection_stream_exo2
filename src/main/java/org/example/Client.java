package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
    private String lastName;

    private String firstName;

    private LocalDate birthDate;

    public Client(String lastName, String firstName, LocalDate birthDate ) {
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(lastName, client.lastName) && Objects.equals(firstName, client.firstName) && Objects.equals(birthDate, client.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, birthDate);
    }
}