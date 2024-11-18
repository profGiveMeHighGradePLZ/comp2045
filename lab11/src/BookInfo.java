import java.util.*;

public class BookInfo {

    private List<Publication> pList;

    public BookInfo() {
        this.pList = new ArrayList<Publication>();
    }

    public static void main(String[] args) {
        new BookInfo().runApp();
    }

    public void runApp() {
        addPublications();

//        test the methods here...
//        showAllPublications();
//        showAllBooks();
//        showAllMagazines();
//        showAllKidsMagazines();
//        showKidsMagazineByAge(6);
//        showKidsMagazineByAge(5);
        showPublicationByTitle("Tinkering");
    }


    public void addPublications() {
        pList.add(new Book("Cindy and the Candy Factory", "AA Press","Ben Don"));
        pList.add(new Book("Secret Code", "Ma House" ,"Dim Green"));
        pList.add(new Magazine("Living" ,"Person" ,5,3));
        pList.add(new Magazine("Cooking" ,"Person" ,3,10));
        pList.add(new KidsMagazine("Tinkering" ,"Teens World" ,3 ,10 ,6,12));
        pList.add(new KidsMagazine("Tinkering" ,"Teens World" ,3 ,11 ,6,12));
        pList.add(new KidsMagazine("Tinkering" ,"Teens World" ,3 ,12 ,6,12));
        pList.add(new KidsMagazine("My Dream" ,"Teens World" ,8 ,5 ,3,6));

    }

    public void showAllPublications() {
        for(Publication p:pList){
            p.print();
            System.out.println();
        }
    }

    public void showAllBooks() {
        for(Publication p:pList){
            if(p instanceof Book) {
                p.print();
                System.out.println();
            }
        }


    }

    public void showAllMagazines() {
        for(Publication p:pList){
            if(p instanceof Magazine) {
                p.print();
                System.out.println();
            }
        }


    }

    public void showAllKidsMagazines(){
        for(Publication p:pList){
            if(p instanceof KidsMagazine) {
                p.print();
                System.out.println();
            }
        }


    }

    public void showKidsMagazineByAge(int age){
        for(Publication p:pList){
            if(p instanceof KidsMagazine && ((KidsMagazine) p).Suitable(age)) {
                p.print();
                System.out.println();
            }
        }


    }

    public void showPublicationByTitle(String s) {
        for(Publication p:pList){
            if(p.getTitle().compareToIgnoreCase(s) == 0) {
                p.print();
                System.out.println();
            }
        }


    }
}

