package LottoByRockpago;

import java.util.Random;


public class LottoNumber implements Comparable {

    private int number;

    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 45;

    public LottoNumber() {
        pickNumber();
        validate();
    }

    private void validate() {
        if (number < MIN_NUM || number > MAX_NUM)
            throw new IllegalArgumentException("wrong number");
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
