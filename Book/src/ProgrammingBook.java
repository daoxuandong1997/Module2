public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook(){}
    public ProgrammingBook(String language, String framework){
        this.framework = framework;
        this.language = language;
    }
    public ProgrammingBook(String bookCode,String name, String author, double price,String language, String framework){
        super(bookCode, name, author, price);
        this.framework = framework;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
