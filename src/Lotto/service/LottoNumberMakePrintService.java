package Lotto.service;

import Lotto.domain.NumberMaker;
import Lotto.domain.Printer;

import java.util.ArrayList;
import java.util.List;

public class LottoNumberMakePrintService {

    public void numberMakeAndPrint() {
        List numList = new ArrayList<>();

        NumberMaker numberMaker = new NumberMaker();
        Printer printer = new Printer();

        numList = numberMaker.makeNumber();
        
        List list = numberMaker.removeDuplicate(numList);
        if(list.size() < 6)
            numList = numberMaker.makeNumber();

        numberMaker.sorting(numList);

        printer.printNumber(numList);

    }

}
