package HostelApp;

public class Guest {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) {
        if(firstName.length() >= 2) {
            this.firstName = firstName;
            return true;
        } return false; // não conseguiu atribuir
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
