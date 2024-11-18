public class Magazine extends Publication{
    private int volumeNumber;
    private int issueNumber;

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
}
