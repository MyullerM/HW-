public class Book {
    private String name;
    private Author author;
    private int yearOfIssue;

    public Book(Author author, String name, int yearOfIssue) {
        this.author = author;
        this.name = name;
        this.yearOfIssue = yearOfIssue;
    }

    public Author getauthor() {
        return this.author;
    }

    public String getname() {
        return this.name;
    }

    public int getyearOfIssue() {
        return this.yearOfIssue;
    }

    public void setyearOfIssue(int Year) {
        this.yearOfIssue = Year;
    }

    public String toString() {
        return this.name + ", " + this.author + ", " + this.yearOfIssue;
    }
}