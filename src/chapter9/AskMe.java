package chapter9;

public class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("net");
                break;
            case YES:
                System.out.println("yes");
                break;
            case MAYBE:
                System.out.println("naybe");
                break;
            case LATER:
                System.out.println("later");
                break;
            case SOON:
                System.out.println("soon");
                break;
            case NEVER:
                System.out.println("never");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.asl());
        answer(q.asl());
        answer(q.asl());
        answer(q.asl());

    }
}
