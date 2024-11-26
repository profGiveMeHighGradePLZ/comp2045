public class Rectangle extends Shape implements Movable,Resizable{
    private double width;
    private double length;
    private int x = 0;
    private int y = 0;


    public Rectangle() {
        this(' ', 1, 1);
    }

    public Rectangle(char name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public Rectangle(char name, double width, double length,int x,int y) {
        super(name);
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return (width + length) * 2;
    }

    public String toString() {
        return "Rectangle " + super.getName() +"(" + x + "," + y + ")"+ "\nWidth: " + width + "\nLength: " + length + "\n";
    }

    @Override
    public void moveLeft() {
        x -= DX;
    }

    @Override
    public void moveRight() {
        x += DX;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void resize() {
        width*=DEFAULT_FACTOR;
        length*=DEFAULT_FACTOR;
    }
}



