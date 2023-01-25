package homework9;

public class BraceChecker {
    private String text;
    char symbol;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            switch (a) {
                case '(':
                    stack.push(a);
                    break;
                case '[':
                    stack.push(a);
                    break;
                case '{':
                    stack.push(a);
                    break;
                case ')':
                    symbol = (char) stack.pop(a);
                    if (symbol != '(') {
                        System.out.println("Error at :" + i + " opened" + symbol + "but closed" + a);
                        break;
                    }
                case ']':
                    symbol = (char)
                            stack.pop(a);
                    if (symbol != '[') {
                        System.out.println("Error at :" + i + " opened" + symbol + "but closed" + a);
                        break;
                    }
                case '}':

                    symbol = (char)
                            stack.pop(a);
                    if (symbol != '{') {
                        System.out.println("Error at :" + i + ": opened" + symbol + "[but closed" + a);
                        break;
                    }
            }
        }
    }
}