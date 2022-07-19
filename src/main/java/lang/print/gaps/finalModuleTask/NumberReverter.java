package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {//458
        int first= number / 100,second = (number / 10) %10,third = number % 10;
        System.out.println(third * 100 + second * 10 + first);
    }
}
