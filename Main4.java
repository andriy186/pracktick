public class Main4 {
    public static void main(String[] args) {
        int count = 0;

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                String time = String.format("%02d:%02d", hour, minute);

                if (isSymmetric(time)) {
                    count++;
                    System.out.println(time);
                }
            }
        }

        System.out.println("Кількість співпадінь симетричних комбінацій: " + count);
    }

    private static boolean isSymmetric(String time) {
        char[] digits = time.toCharArray();
        int left = 0;
        int right = digits.length - 1;

        while (left < right) {
            if (digits[left] != digits[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
