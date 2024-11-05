public class DailyEvent extends Event{
//    private String description;
    public DailyEvent(String description){
        super(description,0,0,0);
    }
    public String toString(){
        return getDescription()+"(Daily)"+"(id:"+getId()+")";
    }
    public boolean occursOn(int year,int month,int day){
        return true;
    }
    public String toFileString(){
        return "Daily " + getDescription();
    }
}
