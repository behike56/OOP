package abstpolymorphism.after;

public abstract class EmployeeType {
    final static int ENGINEER = 1;
    final static int SALESMAN = 2;
    final static int MANAGER = 3 ;

    static EmployeeType proc(int typeCode){
        switch (typeCode){
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
        }
        return null;
    }

    abstract int getTypeCode();
    abstract int payAmount(AfterEmployee emp);
}
