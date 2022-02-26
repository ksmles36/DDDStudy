package Lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberMaker {

    private List randomNumberList = new ArrayList();


    public List makeNumber() {
        int num;

        for (int i = 0; i < 6; i++) {
            num = (int) (Math.random() * 44 + 1);
            randomNumberList.add(num);
        }

        return randomNumberList;
    }


    public List sorting(List numArr) {
        Collections.sort(numArr);
        return numArr;
    }


    public List removeDuplicate(List numList) {
        Object removeDupList = numList.stream().distinct().collect(Collectors.toList());
        return (List) removeDupList;
    }
}
