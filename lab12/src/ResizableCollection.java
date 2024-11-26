import java.util.ArrayList;
import java.util.List;

public class ResizableCollection {
    public static void main(String[] args) {
        List<Resizable> list = new ArrayList<>();
        list.add(new Rectangle('D',10,20,7,8));
        list.add(new Rectangle('E',5,10,9,10));
        list.add(new Circle('F',5));
        list.add(new Circle('G',15));

        for(Resizable resizable:list){
            System.out.println(resizable);
            resizable.resize();
        }
        System.out.println();
        System.out.println();

        System.out.println("After resize.........");
        for(Resizable resizable:list){
            System.out.println(resizable);
        }
    }
}
