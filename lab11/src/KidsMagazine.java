public class KidsMagazine extends Magazine{
    private int minimumAge;
    private int maximumAge;

    public KidsMagazine(String title,String publisher,int volumeNumber,int issueNumber,int minimumAge,int maximumAge){
        super(title,publisher,volumeNumber,issueNumber);
        this.maximumAge = maximumAge;
        this.minimumAge = minimumAge;
    }

    public boolean Suitable(int age){
        return minimumAge<= age && age <= maximumAge;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Age Range: "+ minimumAge+" - "+ maximumAge);
    }
}
