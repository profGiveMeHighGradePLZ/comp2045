public class Person {
    private String name;
    private int time;
    private boolean isOnRightSide = false;
    Person(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public String getName() {
        return name;
    }
    public int getTime() {
        return time;
    }
    public int cross() {
        isOnRightSide = !isOnRightSide;
        return time;
    }
    public boolean getSide() {
        return isOnRightSide;
    }
    public int cross(Person p) {
        if (p.isOnRightSide == isOnRightSide) {
            return Math.max(cross(), p.cross());
        } 
        System.out.println("Error! Cannot cross together");
            return 0;
    }
    public String toString() {
        return name.charAt(0) + "";
    }
}