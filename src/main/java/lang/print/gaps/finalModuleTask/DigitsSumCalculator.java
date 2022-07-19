package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number/1000, second = (number / 100) % 10, third = (number / 10) % 10, fourth = number % 10;
        System.out.println(first + second + third + fourth);
    }
}
