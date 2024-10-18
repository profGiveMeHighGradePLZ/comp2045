import java.io.File;
import java.util.Scanner;

public class saleAmount {
    public static void main(String[] args) {
        new saleAmount().runApp();
    }
    public void runApp(){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the filename:");
        String filename = scr.nextLine();
        scr.close();
        File inputfile = new File(filename);
        try(Scanner in = new Scanner(inputfile)) {
            double[] Money = new double[3];
            String[] categorys ={"Dinner","Conference","Lodging"};
            int i = 1;
            while(in.hasNextLine()){
                String line = in.nextLine();
                String[] sale = line.split(",");
                if(sale.length == 3) {
                    String category = sale[1];
                    boolean validCategory = false;
                    for(String element : categorys){
                        if (element.equalsIgnoreCase(category)) {
                            validCategory = true;
                            break;
                        }
                    }
                    if(validCategory) {
                        try {
                            double cost = Double.parseDouble(sale[2]);
                            if (category.equalsIgnoreCase(categorys[0])) Money[0] += cost;
                            else if (category.equalsIgnoreCase(categorys[1])) Money[1] += cost;
                            else if (category.equalsIgnoreCase(categorys[2])) Money[2] += cost;
                        }catch (Exception e){
                            System.out.println("Error: "+e.getMessage());
                            i++;
                            continue;
                        }
                    }
                    else System.out.printf("Error %d : Incorrect Service Category!\n",i);
                }
                else System.out.printf("Error %d : Incorrect Line Format!\n",i);
                i++;
            }
            System.out.println("Dinner Sale Amount: "+Money[0]);
            System.out.println("Conference Sale Amount: "+Money[1]);
            System.out.println("Lodging Sale Amount: "+Money[2]);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
