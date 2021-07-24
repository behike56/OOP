package abstpolymorphism.after;

public class Salesman extends EmployeeType{
    @Override
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    @Override
    int payAmount(AfterEmployee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
