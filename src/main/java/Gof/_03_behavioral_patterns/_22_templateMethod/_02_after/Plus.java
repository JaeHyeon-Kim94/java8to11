package Gof._03_behavioral_patterns._22_templateMethod._02_after;

public class Plus implements Operator {
    @Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
