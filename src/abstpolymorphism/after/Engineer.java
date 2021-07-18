package abstpolymorphism.after;

public class Engineer extends EmployeeType{

    @Override
    int getTypeCode() {
        return 0;
    }

    @Override
    public int payAmount(AfterEmployee afterEmployee) {
        return 0;
    }
}
