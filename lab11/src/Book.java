public class Book extends Publication{
    private String author;

    public Book(String title,String publisher,String author){
        super(title,publisher);
        this.author = author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Author: "+author);
    }
}
