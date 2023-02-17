package chapter9;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "obyekt tip string po umalchaniu";
    }
}
