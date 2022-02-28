package LottoByKsm;

import java.util.Random;

public class LottoNumber implements Comparable<LottoNumber>{

    private int number;
    private static final int MAX_NUMBER = 45;
    private static final int MIN_NUMBER = 1;

    public LottoNumber() {
        pickNumber();
        validate();
    }

    private void validate() {
        if(number < MIN_NUMBER || number > MAX_NUMBER)
            throw new IllegalArgumentException("wrong number");
    }

    private void pickNumber() {
        number = new Random().nextInt(MAX_NUMBER) + 1;
    }

    public static LottoNumber generate() {
        return new LottoNumber();
    }

    @Override
    public int compareTo(LottoNumber o) {
        if(this.number < o.number)
            return -1;
        if(this.number == o.number)
            return 0;
        return 1;
    }


    public int getNumber() {
        return this.number;
    }
}
