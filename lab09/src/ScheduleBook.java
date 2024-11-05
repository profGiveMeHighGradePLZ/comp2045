import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

//write comments for your class and methods

public class ScheduleBook {

    private List<Event> aList;

    public ScheduleBook() {

        aList = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        new ScheduleBook().runApp();

    }

    public void runApp() throws Exception {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("1, Load events from file");
            System.out.println("2, Save events to file");
            System.out.println("3, Show event");
            System.out.println("4, Add event");
            System.out.println("5, Remove event");
            System.out.println("6, Quit");
            System.out.println();

            try {
                System.out.print("Option: ");
                int mode = in.nextInt();
                in.nextLine();
                if (validateMode(mode)) {
                    String filename;
                    switch (mode) {
                        case 1:
                            System.out.print("Enter input filename: ");
                            filename = in.nextLine();
                            loadEvents(filename);
                            break;
                        case 2:
                            System.out.print("Enter output filename: ");
                            filename = in.nextLine();
                            saveEvents(filename);
                            break;
                        case 3:
                            System.out.print("Enter the day(YYYY MM DD): ");
                            int year = in.nextInt();
                            int month = in.nextInt();
                            int day = in.nextInt();
                            printEventsOn(year,month,day);
                            break;
                        case 4:
                            addEvent(in);
                            break;
                        case 5:
                            System.out.print("Enter event id: ");
                            int id = in.nextInt();
                            removeEvent(id);
                            break;
                        case 6:
                            System.out.println("Bye!");
                            return;
                    }
                }
            } catch (Exception e) {
                in.nextLine();
                System.out.println(e.getMessage());
            }
        }

    }

    private boolean validateMode(int mode) throws Exception{
        if(!(1 <= mode && mode <= 6))
            throw new Exception("No such option!");
        return true;
    }

    public void saveEvents(String filename) throws Exception {
        File file = new File(filename);
        FileWriter fwriter = new FileWriter(file,true);
        PrintWriter out = new PrintWriter(fwriter);
        for(int i = 0;i<aList.size();i++){
            out.println(aList.get(i).toFileString());
        }
    }

    public int loadEvents(String filename) throws Exception {
        File file = new File(filename);
        int count = 0;
        int year = 0;
        int month = 0;
        int day = 0;
        String description = "";
        try(Scanner in = new Scanner(file)) {
            while(in.hasNextLine()){
                String Category = in.next();
                switch (Category){
                    case "Onetime":
                        year = in.nextInt();
                        month = in.nextInt();
                        day = in.nextInt();
                        description = in.nextLine();
                        aList.add(new OnetimeEvent(description,year,month,day));
                        break;
                    case "Monthly":
                        year = 0;
                        month = 0;
                        day = in.nextInt();
                        description = in.nextLine();
                        aList.add(new MonthlyEvent(description,day));
                        break;
                    case "Daily":
                        year = 0;
                        month = 0;
                        day = 0;
                        description = in.nextLine();
                        aList.add(new DailyEvent(description));
                        break;
                }
                count++;
            }
        }catch (Exception e){

            System.out.println(e.getMessage());
        }
        return count;


    }

    public void addEvent(Scanner in) {
        try {
            boolean flag = false;
            in = new Scanner(System.in);
            do{
            System.out.print("Event type (onetime, daily or monthly): ");
            String category = in.nextLine().toLowerCase();
            int year = 0,month = 0,day = 0;
            String description;
            switch (category){
                case "onetime":
                    System.out.print("Enter the date(YYYY MM DD): ");
                    year = in.nextInt();
                    month = in.nextInt();
                    day = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter description: ");
                    description = in.nextLine();
                    aList.add(new OnetimeEvent(description,year,month,day));
                    flag = true;
                    break;
                case "monthly":
                    System.out.print("Enter the day of the month: ");
                    day = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter description: ");
                    description = in.nextLine();
                    aList.add(new MonthlyEvent(description,day));
                    flag = true;
                    break;
                case "daily":
                    System.out.print("Enter description: ");
                    description = in.nextLine();
                    aList.add(new DailyEvent(description));
                    flag = true;
                    break;
                default:
                    System.out.println("Error! Please input again!");
            }}while(!flag);
        }catch (Exception e){
            in.nextLine();
            System.out.println(e.getMessage());
        }

    }

    public void removeEvent(int id) {
        for(int i = 0;i<aList.size();i++){
            if(aList.get(i).getId() == id){
                aList.remove(i);
                break;
            }
        }
    }


    /**
     *  You are not allowed to modify this method
     *  Print all events occur on the given date
     * @param year - year of the event
     * @param month - month of the event
     * @param day - day of the event
     */
    public void printEventsOn(int year, int month, int day) {
        for (Event a : aList) {
            if (a.occursOn(year, month, day)) {
                System.out.println(a);
            }
        }
    }

}
