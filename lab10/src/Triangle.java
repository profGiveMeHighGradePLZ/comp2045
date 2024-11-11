public class Triangle extends Shape{
    private double slide1;
    private double slide2;
    private double slide3;

    public Triangle(String name,int slide1,int slide2,int slide3){
        super(name);
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public Triangle(String name,int slide){
        this(name,slide,slide,slide);
    }

    public Triangle(){
        this(" ",1);
    }

    @Override
    public double area() {
        double s = perimeter()/2.0;
        return Math.sqrt(s*(s-slide1)*(s-slide2)*(s-slide3));
    }

    @Override
    public double perimeter() {
        return slide1+slide2+slide3;
    }

    @Override
    public String toString() {
        return "Triangle: " + getName()+"\nSide lengths: "+slide1+" "+slide2+" "+slide3;
    }
}
