package infpolymorphism.fee.imp;

import infpolymorphism.fee.inf.Fee;
import infpolymorphism.yen.Yen;

public class AdultFee implements Fee {
    public Yen yen(){
        return new Yen(100);
    }

    @Override
    public Yen yen(int num) {
        Yen o = null;
        return o;
    }

    public String label(){
        return "大人";
    }
}
