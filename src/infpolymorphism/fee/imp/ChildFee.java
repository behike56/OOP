package infpolymorphism.fee.imp;

import infpolymorphism.fee.inf.Fee;
import infpolymorphism.yen.Yen;

public class ChildFee implements Fee {
    public Yen yen(int num){
        return new Yen(50);
    }

    public String label(){
        return "子供";
    }

    @Override
    public Yen yen() {
        return null;
    }
}
