public class OnetimeEvent extends Event{
//    private int year;
//    private int month;
//    private int day;
//    private String description;
    public OnetimeEvent(String description,int year,int month,int day){
        super(description,year,month,day);
    }
    public String toString(){
        return getDescription()+"(One time)"+"(id:"+getId()+")";
    }
    public boolean occursOn(){
        return true;
    }
    public String toFileString(){
        return "Onetime " + getYear()+" "+getMonth()+" "+getDay()+" "+getDescription();
    }
}
