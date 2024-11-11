import java.util.ArrayList;
import java.util.List;

public class MyShapeList {

    private List<Shape> shapeList;

    public MyShapeList() {
        shapeList = new ArrayList<>();
    }

    public void runApp() {
        addShapes();
        System.out.println("==================================");
        System.out.println("Print List: ");
        printList();
        System.out.println("==================================");
        System.out.printf("Total Area: %.2f\n", totalArea());
        System.out.printf("Total Perimeter: %.2f\n", totalPerimeter());
        System.out.println("No. of Circles: " + numOfCircle());
        System.out.println("No. of Triangles: " + numOfTriangle());

    }

    public void addShapes() {
        shapeList.add(new Circle());
        shapeList.add(new Circle("MyCircle",10));
        shapeList.add(new Triangle());
        shapeList.add(new Triangle("EquilateralTriangle",6));
        shapeList.add(new Triangle("MyTriangle",6,7,8));
    }

    public void printList() {
        for(int i = 0;i<shapeList.size();i++){
            System.out.println(shapeList.get(i));
        }
    }
    double totalArea() {
        double totalArea = 0;
        for (int i = 0;i<shapeList.size();i++){
            totalArea += shapeList.get(i).area();
        }
        return totalArea;
    }
    double totalPerimeter() {
        double totalP = 0;
        for (int i = 0;i<shapeList.size();i++){
            totalP += shapeList.get(i).perimeter();
        }
        return totalP;
    }

    int numOfCircle() {
        int count = 0;
        for(int i = 0;i<shapeList.size();i++){
            if(shapeList.get(i) instanceof  Circle)
                count++;
        }
        return count;
    }

    int numOfTriangle() {
        int count = 0;
        for(int i = 0;i<shapeList.size();i++){
            if(shapeList.get(i) instanceof  Triangle)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        new MyShapeList().runApp();
    }
}
