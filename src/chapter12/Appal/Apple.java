package chapter12.Appal;

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12),
    Winesap(15), Cortland(8);

    private int prise;

    Apple(int р) {
        prise= р;
    }

    public int getPrise() {
        return prise;
    }
}