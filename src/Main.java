public class Main {
    public static void main(String[] args) {

        var bookAuthor1 = new Author("Лев", "Толстой");
        var bookAuthor2 = new Author("Михаил", "Шолохов");
        var bookAuthor3 = new Author("Михаил", "Шолохов");

        var book1 = new Book("Война и мир", bookAuthor1, 1864);
        var book2 = new Book("Тихий Дон", bookAuthor2, 1925);
        var book3 = new Book("Тихий Дон", bookAuthor3, 1925);

        book1.setyearPublication(1863);

        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println("book3: " + book2);

        if (book2.equals(book3)) {
            System.out.println("book2 и book3 одинаковые");
        } else {
            System.out.println("book2 и book3 разные");
        }
    }
}