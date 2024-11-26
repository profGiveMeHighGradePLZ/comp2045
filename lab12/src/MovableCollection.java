import java.util.*;

public class MovableCollection {
    private List<Movable> movableList;

    public MovableCollection() {
        movableList = new ArrayList<Movable>();
    }

    public static void main(String args[]) {
        new MovableCollection().runApp();
    }

    void runApp() {
        movableList.add(new Point('A', 1, 2));
        movableList.add(new Point('B', 3, 4));
        movableList.add(new Point('C', 5, 6));

        //your code goes here...
        movableList.add(new Rectangle('D',10,20,7,8));
        movableList.add(new Rectangle('E',5,10,9,10));
        for(Movable m :movableList){
            System.out.println(m);
        }
        for(Movable m :movableList){
            m.moveRight();
        }
        System.out.println("After moving right........");
        for(Movable m :movableList){
            System.out.println(m);
        }
    }
}
