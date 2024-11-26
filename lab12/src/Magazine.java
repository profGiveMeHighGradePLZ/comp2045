import java.time.LocalDate;

public class Magazine extends Publication implements Checkoutable{
    private int volumeNumber;
    private int issueNumber;
    private LocalDate CheckoutDate;


    public Magazine(String title,String publisher,int volumeNumber,int issueNumber){
        super(title,publisher);
        this.volumeNumber = volumeNumber;
        this.issueNumber = issueNumber;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Volume: " + volumeNumber);
        System.out.println("Issue: " + issueNumber);
    }


    @Override
    public void checkout() {
        CheckoutDate = LocalDate.now();
        print();
        System.out.println("Check out date: "+CheckoutDate);
    }

    @Override
    public LocalDate returnDate() {
        return CheckoutDate.plusDays(7);
    }
}
