package LottoByRockpago;

public class Single {

    private int no;
    private static Single instance;

    private Single() {
        no = 1;
    }

    public static Single getInstance() {
        if (instance == null){
            instance = new Single();
        }
        return instance;
    }

}
