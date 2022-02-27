package LottoByKsm;

import java.util.*;

public class LottoNumbers {

    private List<LottoNumber> list;
    private static final int SIZE = 6;

    public LottoNumbers() {
        makeList();
        validate();
        sorting();
    }

    private void sorting() {
        Collections.sort(list);
    }

    private void validate() {
        if(list.size() != SIZE)
            throw new IllegalStateException("wrong list");
    }

    private void makeList() {
        HashSet<LottoNumber> temp = new HashSet<>();

        while (temp.size() != SIZE) {
            temp.add(LottoNumber.generate());
        }

        list = new ArrayList<>(temp);
    }

}
