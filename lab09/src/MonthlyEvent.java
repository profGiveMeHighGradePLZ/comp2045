public class MonthlyEvent extends Event{
    public MonthlyEvent(String description,int day){

        super(description,0,0,day);

    }
    public String toString(){
        return getDescription()+"(Monthly)"+"(id:"+getId()+")";
    }
    public boolean occursOn(int year,int month,int day){
        if(getDay() != day)
            return false;
        if(day == 31 && (month == 4 || month == 6 || month == 9 || month == 11))
            return false;
        if(month == 2 && day >29)
            return false;
        return true;
    }
    public String toFileString(){
        return "Monthly " + getDay()+" "+getDescription();
    }
}
