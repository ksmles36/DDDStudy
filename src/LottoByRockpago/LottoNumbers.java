package LottoByRockpago;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class LottoNumbers {

    private List<LottoNumber> list;
    private static final int SIZE = 6;

    private LottoNumbers() {
        makeList();
        validate();
        Collections.sort(list);
    }

    private void validate() {
        if (list.size() != SIZE)
            throw new IllegalStateException("wrong list");
    }

    private void makeList() {
        HashSet<LottoNumber> temp = new HashSet<>();
        while (temp.size() != SIZE) {
            temp.add(LottoNumber.generate());
        }
        list = new ArrayList<>(temp);
    }

    public static LottoNumbers generate() {
        return new LottoNumbers();
    }

    public List<LottoNumber> getList() {
        return list;
    }
}
