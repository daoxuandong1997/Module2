public class Main {
    public static void main(String[] args) {
        Book [] books = new Book[10];
        books[0] = new ProgrammingBook("B01", "Sách Lập Trình Java 01", "Đào Xuân Đông", 35000, "Java", "Framework 01");
        books[1] = new FictionBook("B02", "Sách 02", "Tác giả 02", 20000, "02");
        books[2] = new ProgrammingBook("B03", "Sách Lập Trình C", "Đào Xuân Đông", 15500, "C", "Framework 03");
        books[3] = new FictionBook("B04", "Sách 04", "Tác giả 04", 100000, "04");
        books[4] = new FictionBook("B05", "Sách 05", "Tác giả 05", 65000, "05");
        books[5] = new ProgrammingBook("B06", "Sách Lập Trình C++", "Đào Xuân Đông", 20000, "C++", "Framework 01");
        books[6] = new FictionBook("B07", "Sách 05", "Tác giả 05", 26000, "06");
        books[7] = new ProgrammingBook("B08", "Sách Lập Trình Java 02", "Đào Xuân Đông", 40000, "Java", "Framework 02");
        books[8] = new ProgrammingBook("B09", "Sách Lập Trình Java 03", "Đào Xuân Đông", 45000, "Java", "Framework 03");
        books[9] = new FictionBook("B10", "Sách 10", "Tác giả 04", 96000, "10");

        // em tinh ma no ko ra :((
        System.out.println("Tổng tiền = " + sumOfPrice(books));
        System.out.println("Số quyển sách Java:" +  countProgramingBookByLanguage(books));
    }

    public static double sumOfPrice(Book[] books) {
        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }

    public static int countProgramingBookByLanguage(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                String language = ((ProgrammingBook) book).getLanguage();
                if (language.equalsIgnoreCase("java")) {
                    count++;
                }
            }
        }
        return count;
    }
}
