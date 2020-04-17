public class Book {
    private String bookCode;
    private String name;
    private String author;
    private int price;

    public Book(){}

    public Book(String bookCode,String name, String author, double price){
        this.author = author;
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
   }
}
