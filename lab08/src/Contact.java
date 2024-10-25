public class Contact {
    private String name;
    private String[] number = new String[0];

    public Contact(String name, String num){
        this.name = name;
        String[] array = number;
        number = new String[number.length+1];
        for(int i = 0;i< array.length;i++){
            number[i] = array[i];
        }
        number[number.length-1] = num;
    }

    public Contact(String name){
        new Contact(name,"0");
    }

    public String getName(){
        return name;
    }

    public String[] getPhoneNos(){
        return number;
    }

    public void addPhoneNo(String num){
        String[] array = number;
        number = new String[number.length+1];
        for(int i = 0;i< array.length;i++){
            number[i] = array[i];
        }
        number[number.length-1] = num;
    }

    public void deletePhoneNo(String num){
        int index = -1;
        for(int i = 0;i< number.length;i++){
            if(number[i].equals(num)){
                index = i;
                break;
            }
        }

        if(index >= 0) {
            String[] tmp = new String[number.length - 1];
            for(int i = 0;i<index;i++){
                tmp[i] = number[i];
            }
            for(int i = index;i<tmp.length;i++){
                tmp[i] = number[i+1];
            }
            number = tmp;
        }
    }
    public String toString(){
        String output = "";
        output += "Name: " + name +"\nPhone number(s): ";
        for(int i = 0;i<number.length;i++){
            output += ("\n[" + i + "] " + number[i]);
        }
        output += "\n";
        return output;
    }

    public static void main(String[] args) {
        Contact c1 = new Contact("Chan Tai Man", "91234567");
        System.out.println(c1);
        c1.addPhoneNo("97654321");
        System.out.println(c1);
        String[] p = c1.getPhoneNos();
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
        c1.deletePhoneNo("91234567");
        System.out.println(c1);
        Contact c2 = new Contact("Luk Mei Mei");
        System.out.println(c2);
    }
}
