public class Main {
    public static void main(String[] args) {
        Author joanneRowling = new Author("Joanne", "Rowling");
        Book garryPotter = new Book(joanneRowling, "Garry Potter", 1997);
        System.out.println(garryPotter);
        System.out.println(garryPotter.getname());
        System.out.println(garryPotter.getauthor());
        System.out.println(garryPotter.getyearOfIssue());
        garryPotter.setyearOfIssue(2000);
        System.out.println(garryPotter.getyearOfIssue());

        Author levTolsloy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book(levTolsloy, "warAndPeace", 1865);
        System.out.println(warAndPeace);
        System.out.println(warAndPeace.getname());
        System.out.println(warAndPeace.getauthor());
        System.out.println(warAndPeace.getyearOfIssue());
        warAndPeace.setyearOfIssue(1869);
        System.out.println(warAndPeace.getyearOfIssue());


    }
}