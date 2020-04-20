package Cal;

public class Calculator {
    public int add(int firstOperand, int secondOperand){
        if (firstOperand / 2 + secondOperand / 2 >= Integer.MAX_VALUE / 2){
            throw new RuntimeException("out of range exception");
        }
        return firstOperand + secondOperand;
    }
    public int sub(int firstOperand, int secondOperand){
        if (firstOperand / 2 + secondOperand / 2 <= Integer.MIN_VALUE / 2){
            throw new RuntimeException("out of range exception");
        }
        return firstOperand + secondOperand;
    }
}

