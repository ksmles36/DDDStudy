package Lotto.domain;

import java.util.List;

public class Printer {

    public void printNumber(List numArr) {
        for (Object num : numArr){
            System.out.print(num + "  ");
        }
    }
}
