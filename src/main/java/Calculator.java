public class Calculator {
    private int value1;
    private int value2;

    public Calculator(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public int divide(int value1, int value2) {
        return value1 / value2;
    }
}