public class Main {
    public static void main(String[] args) {
        Author JoanneRowling = new Author("Joanne", "Rowling");
        Book garryPotter = new Book(JoanneRowling, "Garry Potter", 1997);
        System.out.println(garryPotter);
        System.out.println(garryPotter.getName());
        System.out.println(garryPotter.getAuthor());
        System.out.println(garryPotter.getYearOfIssue());
        garryPotter.setYearOfIssue(2000);
        System.out.println(garryPotter.getYearOfIssue());

        Author LevTolsloy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book(LevTolsloy, "warAndPeace", 1865);
        System.out.println(warAndPeace);
        System.out.println(warAndPeace.getName());
        System.out.println(warAndPeace.getAuthor());
        System.out.println(warAndPeace.getYearOfIssue());
        warAndPeace.setYearOfIssue(1869);
        System.out.println(warAndPeace.getYearOfIssue());


    }
}