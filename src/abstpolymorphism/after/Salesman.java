package abstpolymorphism.after;

import org.jetbrains.annotations.NotNull;

public class Salesman extends EmployeeType{
    @Override
    int getTypeCode() {
        return 0;
    }

    @Override
    public int payAmount(AfterEmployee afterEmployee) {
        return 0;
    }
}
