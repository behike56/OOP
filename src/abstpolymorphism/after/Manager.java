package abstpolymorphism.after;

public class Manager extends EmployeeType{
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override
    int payAmount(AfterEmployee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
