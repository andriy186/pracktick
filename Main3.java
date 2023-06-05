public class Main3{
    public static void main(String[] args) {
        int number = 10;
        int factorialFor = 1;
        int factorialWhile = 1;

        for (int i = 1; i <= number; i++) {
            factorialFor *= i;
        }

        int i = 1;
        while (i <= number) {
            factorialWhile *= i;
            i++;
        }

        System.out.println("Факторіал числа " + number + " (за допомогою for): " + factorialFor);
        System.out.println("Факторіал числа " + number + " (за допомогою while): " + factorialWhile);
    }
}
