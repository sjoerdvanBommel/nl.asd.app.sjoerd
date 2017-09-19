package nl.asd.app.sjoerd;

public class SymbolChecker {

    HANStack<String> hanStack;

    public static void main(String[] args) {
        SymbolChecker symbolChecker = new SymbolChecker();
        symbolChecker.start();
    }

    private void start() {
        hanStack = new HANStack<String>("");
        hanStack.push("(");
        hanStack.push("t");
        hanStack.push("e");
        hanStack.push("s");
        hanStack.push("t");
        hanStack.push(")");
        try {
            checkSymbols();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean checkSymbols() throws Exception {
        int brackets = 0;
        String value;
        HANStack tempStack = hanStack;
        while ((value = (String) tempStack.pop()) != null) {
            if (value.equals("(")) {
                brackets++;
            }
            if (value.equals(")")) {
                brackets--;
            }
        }
        if (brackets < 0) {
            throw new Exception("Te veel close brackets");
        }
        if (brackets > 0) {
            throw new Exception("Te veel opening brackets");
        }
        return true;
    }

}
