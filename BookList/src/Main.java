import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Hayvan Çiftliği", 152,"George Orwell", 1945));
        bookList.add(new Book("Satranç", 83,"Stefan Zweig", 1941));
        bookList.add(new Book("Küçük Prens", 112,"Antoine de Saint-Exupéry", 1943));
        bookList.add(new Book("Dönüşüm ", 74,"Franz Kafka", 1915));
        bookList.add(new Book("Bilinmeyen Bir Kadının Mektubu", 68,"Stefan Zweig", 1922));
        bookList.add(new Book("İnsan Neyle Yaşar ?", 96,"Lev Tolstoy", 1885));
        bookList.add(new Book("Fareler ve İnsanlar", 125,"John Steinbeck", 1937));
        bookList.add(new Book("1984", 352,"George Orwell", 1938));
        bookList.add(new Book("Suç ve Ceza", 687,"Fyodor Dostoyevski", 1886));
        bookList.add(new Book("Olağan Üstü Bir Gece", 69,"Stefan Zweig", 1922));

        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getBookName(), book.getAuthorName()));

        for (String i : bookMap.keySet()) {
            System.out.println(i + " - " + bookMap.get(i));
        }


        List<Book> filterBook = bookList.stream().filter(book -> book.getBookPage() > 300).collect(Collectors.toList());
        filterBook.stream().forEach(b -> System.out.println(
                "Book Name : "+ b.getBookName()+ " "+
                        "Page Number : "+b.getBookPage()+ " "+
                        "Author : "+b.getAuthorName()+ " "+
                        "Year : "+b.getPublishDate()));

                long count = filterBook.stream().count();
                System.out.println("Number of books : " +count);

    }
}