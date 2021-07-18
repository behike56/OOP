package infpolymorphism.fee;

import infpolymorphism.fee.imp.AdultFee;
import infpolymorphism.fee.imp.ChildFee;
import infpolymorphism.fee.inf.Fee;
import infpolymorphism.yen.Yen;

enum FeeType {
    adult(new AdultFee()),
    child(new ChildFee()),
    senior(new SeniorFee());

    private Fee fee;
    //Feeインターフェースを実装したどれかのクラスのオブジェクト

    private FeeType(Fee fee) {
        this.fee = fee;
        //料金区分ごとのオブジェクトを設定する
    }

    Yen yen() {
        return fee.yen();
    }

    String label() {
        return fee.label();
    }


}
