package OOP.lesson7.lesson7.book;

public class Book {
    String nameBook;
    String author;
    int pages;
    boolean isDocumentary;

    public Book(String nameBook, String author, int pages, boolean isDocumentary) {
        this.nameBook = nameBook;
        this.author = author;
        this.pages = pages;
        this.isDocumentary = isDocumentary;
    }

    public int getPages() {
        return this.pages * 40;
    }

    public int totalLines(int countRows){
        return this.pages * countRows;
    }
    public void bookInfo(){
        System.out.printf("%s от %s - %s\n",nameBook,author, isDocumentary ? "Документальная" : "Недокументальная");
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", isDocumentary=" + isDocumentary +
                '}';
    }
}
