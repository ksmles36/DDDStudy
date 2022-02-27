package Lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberMaker {

    private List<Integer> randomNumberList = new ArrayList();


    public List<Integer> makeNumber() {
        int num;

        for (int i = 0; i < 6; i++) {
            num = (int) (Math.random() * 44 + 1);
            randomNumberList.add(num);
        }

        return randomNumberList;
    }


    public List<Integer> sorting(List<Integer> numArr) {
        Collections.sort(numArr);
        return numArr;
    }


    public List<Integer> removeDuplicate(List<Integer> numList) {
        Object removeDupList = numList.stream().distinct().collect(Collectors.toList());
        return (List<Integer>) removeDupList;
    }
}
