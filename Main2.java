public class Main2 {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("Додатні дільники числа " + number + ":");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
