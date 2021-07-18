package infpolymorphism.fee;

import infpolymorphism.fee.inf.Fee;
import infpolymorphism.yen.Yen;

class SeniorFee implements Fee {
    @Override
    public Yen yen(int num) {
        return null;
    }

    @Override
    public String label() {
        return null;
    }

    @Override
    public Yen yen() {
        return null;
    }
}
