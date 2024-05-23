public class Book {
    private String Name;
    private Author author;
    private int yearOfIssue;

    public Book(Author author, String Name, int yearOfIssue) {
        this.author = author;
        this.Name = Name;
        this.yearOfIssue = yearOfIssue;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.Name;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }

    public void setYearOfIssue(int Year) {
        this.yearOfIssue = Year;
    }

    public String toString() {
        return this.Name + ", " + this.author + ", " + this.yearOfIssue;
    }
}