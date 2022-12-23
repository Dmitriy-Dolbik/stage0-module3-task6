package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void main(String[] args) {
        FloatTypeCasting ftc = new FloatTypeCasting();
        ftc.roundNumber(10.4f);
    }
    public void roundNumber(float numberToBeRounded) {
        int result = Math.round(numberToBeRounded);
        System.out.println(result);
    }
}
