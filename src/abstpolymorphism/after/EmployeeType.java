package abstpolymorphism.after;

abstract class EmployeeType {
    final static int ENGINEER = 1;
    final static int SALESMAN = 2;
    final static int MANAGER = 3 ;

    abstract int getTypeCode();
    public abstract int payAmount(AfterEmployee afterEmployee);
}
