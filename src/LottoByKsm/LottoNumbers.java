package LottoByKsm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LottoNumbers {

    private List<LottoNumber> list;
    private static final int SIZE = 6;

    public LottoNumbers() {
        makeList();
        validate();
        sort();
    }

    private void sort() {
        Collections.sort(list);
    }

    private void validate() {
        if(list.size() < SIZE)
            throw new IllegalArgumentException("wrong list");
    }

    private void makeList() {
        HashSet<LottoNumber> set = new HashSet<>();
        while (set.size() != SIZE) {
            set.add(LottoNumber.generate());
        }
        list = new ArrayList<>(set);
    }

    public static LottoNumbers generate() {
        return new LottoNumbers();
    }

    public List<LottoNumber> getList() {
        return list;
    }
}
