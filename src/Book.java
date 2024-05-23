public class Book {
    private String Name;
    private Author author;
    private int yearOfIssue;

    public Book(String Name, Author author, int yearOfIssue) {
        this.Name = Name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public String getBookName() {
        return this.Name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }
}
}
