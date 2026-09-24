public class Date {
    //setMonth, getMonth(int)
    //setMonth, getMonth(String)
    //setDay, getDay
    //setYear, getYear

    private int Day, Monthi, Year;
    private String MonthS;

    public void setDay(int d){
        Day = d;
    }

    public int getDay(){
        return Day;
    }

    public void setMonthi(int m){
        Monthi = m;
    }

    public int getMonthi(){
        return Monthi;
    }

    public void setMonthS(String M){
        MonthS = M;
    }

    public String getMonthS(){
        return MonthS;
    }

    public void setYear(int y){
        Year = y;
    }

    public int getYear(){
        return Year;
    }

    public void getDate(){
        System.out.println(getMonthi()+"/"+getDay()+"/"+getYear());
        System.out.println(getMonthS()+" "+getDay()+", "+getYear());
        System.out.println(getDay()+" "+getMonthS()+" "+getYear());
    }
}
