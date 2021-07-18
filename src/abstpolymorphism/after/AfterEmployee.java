package abstpolymorphism.after;

public class AfterEmployee {

    private EmployeeType _type;

    int getType(){
        return _type.getTypeCode();
    }

     public int payAmount(){
        return _type.payAmount(this);
    }

    int getMonthlySalary(){
        return 10;
    }

    int getCommission(){
        return 20;
    }
}
