/**
 * Correct output of the program is:
 *
Item : Banana Price : 1.5 Quantity : 2
Item : Orange Price : 3.5 Quantity : 1
Item : Banana Price : 1.5 Quantity : 5
No such item!
Item : Apple Price : 2.5 Quantity : 0
Total Price : 11.0
 *
 */

public class Cashier {
//    private String[] item;
//    private double[] price;
//    private int[] quantity;
    public static void main(String[] args) {
        Cashier c = new Cashier();
        c.addItem("Apple", 2.5, 3);
        c.addItem("Banana", 1.5, 2);
        System.out.println("Item : " + c.getItem(1) + " Price : " + c.getPrice(1) + " Quantity : " + c.getQuantity(1));
        // Item : Banana Price : 1.5 Quantity : 2
        c.addItem("Orange", 3.5, 1);
        System.out.println("Item : " + c.getItem(2) + " Price : " + c.getPrice(2) + " Quantity : " + c.getQuantity(2));
        // Item : Orange Price : 3.5 Quantity : 1
        c.adjustQuantity(1, 5); //this is to change the quantity of the item at index 1 to 5
        System.out.println("Item : " + c.getItem(1) + " Price : " + c.getPrice(1) + " Quantity : " + c.getQuantity(1));
        // Item : Banana Price : 1.5 Quantity : 5

        try {
            c.getItem(3); //this will throw an exception as there is no item at index 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("No such item!");
            // No such item!
        }


        //System.out.println(c);


        c.adjustQuantity(3, 0); //this will do nothing as there is no item at index 3
        c.adjustQuantity(2, -1); //this will do nothing as the quantity cannot be negative
        c.adjustQuantity(0, 0);
        System.out.println("Item : " + c.getItem(0) + " Price : " + c.getPrice(0) + " Quantity : " + c.getQuantity(0));
        // Item : Apple Price : 2.5 Quantity : 0
        System.out.println("Total Price : " + c.getTotalPrice());
        // Total Price : 7.5--->11
        /*i think the total price would be 11
        * 0 apple    5 banana       1 orange
        * 0          7.5            3.5*/
    }

    /**
     * According to the main method shown above, finish the implementation of the class Cashier.
     */
    //TODO
    private String[] item;
    private double[] price;
    private int[] quantity;

    public Cashier (){
        item = new String[0];
        price = new double[0];
        quantity = new int[0];
    }

    public void addItem(String fruit,double cost, int num){
        String[] list = new String[item.length+1];
        for(int i = 0;i<item.length;i++){
            list[i] = item[i];
        }
        list[item.length] = fruit;
        item = list;

        double[] p = new double[price.length+1];
        for(int i = 0;i<price.length;i++){
            p[i] = price[i];
        }
        p[price.length] = cost;
        price = p;

        int[] q = new int[quantity.length+1];
        for(int i = 0;i<quantity.length;i++){
            q[i] = quantity[i];
        }
        q[quantity.length] = num;
        quantity = q;
    }

    public String getItem(int index){
        return item[index];
    }

    public double getPrice(int i){
        return price[i];
    }

    public int getQuantity(int i){
        return quantity[i];
    }

    public void adjustQuantity(int index,int newQuantity){
        if(index >= 0 && index < item.length && newQuantity >= 0) {
            quantity[index] = newQuantity;
        }
    }

    public double getTotalPrice(){
        double total = 0;
        for(int i = 0;i<item.length;i++){
            total += price[i]*quantity[i];
        }
        return total;
    }

//    public String toString(){
//        String output = "";
//        for(int i = 0;i<item.length;i++) output+=item[i];
//        return output;
//    }
}
