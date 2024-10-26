public class PhoneBook {
    private Contact[] book;

    public PhoneBook(){
        book = new Contact[0];
    }

    public void addContact(String name,String num){
        Contact[] newbook = new Contact[book.length+1];
        int index = 0;
        boolean insert = false;
        for(int i = 0;i< book.length;i++){
            if(!insert && book[i].getName().compareTo(name) > 0){
                newbook[index++] = new Contact(name, num);
                insert = true;
            }
            newbook[index++] = book[i];
        }
        if(!insert) newbook[index] = new Contact(name,num);
        book = newbook;
    }

    public Contact getContact(String name){
        for(int i = 0;i<book.length;i++){
            if(book[i].getName().equals(name)){
                return book[i];
            }
        }
        return null;
    }

    public void  addPhoneToExistingContact(String name, String num){
        for(int i = 0;i<book.length;i++){
            if(book[i].getName().equals(name)){
                book[i].addPhoneNo(num);
                break;
            }
        }
    }

    public void updateContact(String name,String oldNum, String newNum){
        for(int i = 0;i<book.length;i++){
            if(book[i].getName().equals(name)){
                book[i].deletePhoneNo(oldNum);
                book[i].addPhoneNo(newNum);
                break;
            }
        }
    }

    public void removeContact(String name){
        Contact[] newbook = new Contact[book.length-1];
        int index = 0;
        for(int i = 0;i< book.length;i++){
            if(book[i].getName().equals(name)) continue;
            newbook[index++] = book[i];
        }
        book = newbook;
    }

    public String toString(){
        String output = "";
        for(int i = 0;i< book.length;i++){
            output += book[i];
        }
        return output;
    }

    public static void main(String[] args) {
        PhoneBook b = new PhoneBook();
        //add contacts
        b.addContact("Chan Tai Man", "96385274");
        System.out.println(b);
        b.addContact("Ma Kin", "65478921");
        System.out.println(b);
        b.addContact("Au Siu Ming", "94562584");
        System.out.println(b);
        b.addContact("Koo Ka Ka", "91122334");
        System.out.println(b);
        //get contacts
        System.out.println(b.getContact("Chan Tai Man"));
        System.out.println(b.getContact("X X X")); //null
        System.out.println();
        //add phone no. to an existing contact
        b.addPhoneToExistingContact("Au Siu Ming", "61234578");
        System.out.println(b.getContact("Au Siu Ming"));
        //update the phone no. in an existing contact
        b.updateContact("Ma Kin", "65478921", "61231231");
        System.out.println(b.getContact("Ma Kin"));
        //remove contacts
        b.removeContact("Ma Kin");
        System.out.println(b);
        b.removeContact("Chan Tai Man");
        System.out.println(b);
        b.removeContact("Au Siu Ming");
        System.out.println(b);
        b.removeContact("Koo Ka Ka");
        System.out.println(b);
    }
}
