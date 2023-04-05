package bills_lec10;

public class bill {
    private String strCustomer;
    private double dblMinutes, dblCost;
    
    //constructor receiving variables
    public bill(String strName, double dblMinutesTalked, double dblCostPerMinute){
        strCustomer = strName;
        dblMinutes = dblMinutesTalked;
        dblCost = dblCostPerMinute;
    }

   
    public String getName()
    {
        return strCustomer;
    }
    
    public double getTotalBills(){
        return (dblMinutes * dblCost);
    }
}
