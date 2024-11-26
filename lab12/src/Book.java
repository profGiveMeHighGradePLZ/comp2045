import java.time.LocalDate;

public class Book extends Publication implements Checkoutable{
    private String author;
    private LocalDate CheckoutDate;

    public Book(String title,String publisher,String author){
        super(title,publisher);
        this.author = author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Author: "+author);
    }

    @Override
    public void checkout() {
        CheckoutDate = LocalDate.now();
        print();
        System.out.println("Check out date: "+CheckoutDate);
    }

    @Override
    public LocalDate returnDate() {
        return CheckoutDate.plusDays(15);
    }
}
