public class Author {
    public String firstname;
    public String lastname;

    Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String toString() {
        return this.firstname + " " + this.lastname;
    }
}