package problem2;

public class ThreeNumberCount {
    private int[] numbers;

    public ThreeNumberCount(int[] numbers) {
        this.numbers = numbers;
    }
    public int getThreeNumberCount() {
        int result = 0;
        for (int number : numbers) {
            int tmp = number;
            while (tmp > 0) {
                if (tmp % 10 == 3)
                    result++;
                tmp /= 10;
            }
        }
        return result;
    }
}
