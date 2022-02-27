package LottoByKsm;

import java.util.Random;

public class LottoNumber implements Comparable{

    private int number;
    private static final int MAX_NUM = 45;

    public LottoNumber() {
        pickNumber();
        validate();
    }

    private void pickNumber() {
        number = new Random().nextInt(MAX_NUM + 1);
    }

    public static LottoNumber generate() {
        return new LottoNumber();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
