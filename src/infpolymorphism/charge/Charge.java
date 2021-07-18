package infpolymorphism.charge;

import infpolymorphism.fee.inf.Fee;
import infpolymorphism.yen.Yen;

public class Charge {
    Fee fee;

    Charge(Fee fee){
        this.fee = fee;
    }

    Yen yen(){return fee.yen();}
    }
