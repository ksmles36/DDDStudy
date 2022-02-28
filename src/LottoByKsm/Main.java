package LottoByKsm;

public class Main {

    public static void main(String[] args) {
        LottoNumbers lottoNumbers = LottoNumbers.generate();
        Printer.printNumber(lottoNumbers);
    }

}
