package abstpolymorphism.after;

public class Engineer extends EmployeeType{
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    @Override
    int payAmount(AfterEmployee emp) {
        return emp.getMonthlySalary();
    }
}
