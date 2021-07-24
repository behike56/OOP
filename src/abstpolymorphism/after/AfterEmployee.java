package abstpolymorphism.after;

/**
 * 変更後
 * 抽象クラスによるポリモーフィズム
 *
 * オブジェクトの振る舞いがその型で変わる時
 * 明示的な条件分岐を記述する必要がない。
 * ================================
 * 給与計算クラス
 */
public class AfterEmployee {

    // 給与計算は職業のタイプで決まる。
    // 雑だが、ここでproc()メソッドに渡す値でタイプが決まっている。
    private EmployeeType _type = EmployeeType.proc(1);

    int getType(){
        return _type.getTypeCode();
    }

     public int payAmount(){
         final int i = _type.payAmount(this);
         return i;
    }

    int getMonthlySalary(){
        return 10;
    }

    int getCommission(){
        return 20;
    }

    int getBonus(){
        return 10;
    }
}
