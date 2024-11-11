public class Circle extends Shape{
    private double radius;
    public Circle(){
        this("",1);
    }
    public Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return (double) 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " + getName() + "\nRadius: " + radius;
    }
}
