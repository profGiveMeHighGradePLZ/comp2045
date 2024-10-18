import java.util.Scanner;

public class AdvancedBridgeCrossing {
    public static void main(String[] args) {
        new AdvancedBridgeCrossing().runApp();
    }
    public void runApp() {
        Person lamp = new Person("Lamp", 0); //we make a Lamp as a person with speed 0
        Person[] people = {
            new Person("Alice", 1),
            new Person("Bob", 2),
            new Person("Charlie", 4),
            new Person("Dave", 6),
            new Person("Eve", 10),
            new Person("Fred", 12),
            lamp
        };

        int time = 0;
        Scanner scanner = new Scanner(System.in);
        while (!allOnRight(people)) {
            print(people, time);
            System.out.println("Enter your choice: ");
            String input1 = scanner.next();
            String input2 = scanner.next();
            if (!isValidKey(people, input1) || !isValidKey(people, input2) || input1.equals(input2)) {
                System.out.println("Invalid input");
                continue;
            }
            Person p1 = null, p2 = null;
            for (Person p : people) {
                if (p1 == null && p.toString().equals(input1))
                    p1 = p;
                else if (p2 == null && p.toString().equals(input2))
                    p2 = p;
            }
            
            if (p1 != null && p2 != null) {
                if (p1.getSide() != lamp.getSide() || p2.getSide() != lamp.getSide()) {
                    System.out.println("Invalid input");
                    continue;
                }
                int timetaken = p1.cross(p2);
                if (timetaken == 0)
                    continue;
                time += timetaken;
                lamp.cross();
            } else {
                if (p1 == null) 
                    p1 = p2;
                if (p1.getSide() != lamp.getSide()) {
                    System.out.println("Invalid input");
                    continue;
                }
                time += p1.cross();
                lamp.cross();
            }
        }
        System.out.println("Everyone is on the right hand side. Time taken: " + time);
    }

    private boolean isValidKey(Person[] people, String input) {
        if (input.equals("-"))
            return true;
        for (Person p : people)
            if (p != people[people.length - 1] && p.toString().equals(input))
                return true;
        return false;
    }
    public void print(Person[] people, int time) {
        String left = "", right = "";
        for (Person p: people) {
            String name = p == people[people.length - 1] ? "(L)" : p.toString() + "";
            if (p.getSide())
                right += name;
            else
                left += name;

        }
        System.out.println(left + "_____________" + right + " \t | " + time);
    }

    public boolean allOnRight(Person[] p) {
        for (Person person : p)
            if (!person.getSide())
                return false;
        return true;
    }

    

}