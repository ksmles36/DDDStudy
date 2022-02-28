package LottoByKsm;

import java.util.List;

public class Printer {

    public static void printNumber(LottoNumbers lottoNumbers) {
        List<LottoNumber> list = lottoNumbers.getList();
        for (LottoNumber num : lottoNumbers.getList()) {
            System.out.printf(num.getNumber() + "  ");
        }
    }
}
