package infpolymorphism.fee.inf;

import infpolymorphism.yen.Yen;

public interface Fee {
    Yen yen(int num);

    String label();

    Yen yen();
}
