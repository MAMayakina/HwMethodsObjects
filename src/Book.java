public class Book {
    private String bookTitle;
    private Author bookAuthor;
    private int yearPublication;

    public Book(String bookTitle, Author bookAuthor, int yearPublication) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublication = yearPublication;
    }

    public String getbookTitle() {
        return bookTitle;
    }

    public Author getbookAuthor() {
        return bookAuthor;
    }

    public int getyearPublication() {
        return yearPublication;
    }

    public void setyearPublication(int year) {
        if (yearPublication < 1800 && yearPublication > 2020) {
            System.out.println("Ошибка");
            //throw new RuntimeException("Введены некорретные данные");
        } else {
            this.yearPublication = year;
        }
    }
    @Override
    public String toString() {
        return bookTitle + " - " + bookAuthor + " ("+ yearPublication + ")";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return bookTitle.equals(book2.bookTitle);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookTitle);
    }
}
