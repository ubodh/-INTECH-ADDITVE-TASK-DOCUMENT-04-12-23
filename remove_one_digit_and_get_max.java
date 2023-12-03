public class remove_one_digit_and_get_max {

    public static int removeOneDigitToGetMax(int num) {
        // "1234"
        String numStr = String.valueOf(num);
        int maxNum = -1;

        for (int i = 0; i < numStr.length(); i++) {
            String currentNumStr = numStr.substring(0, i) + numStr.substring(i + 1);
            // System.out.println(currentNumStr);
            int currentNum = Integer.parseInt(currentNumStr);
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {
        int number = 1234;
        int result = removeOneDigitToGetMax(number);
        System.out.println(result);
    }
}
