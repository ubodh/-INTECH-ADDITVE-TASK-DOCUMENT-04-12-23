
class stringCompress {

    public static String furtherCompress(String str) {
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            char character = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));

            if (i + 2 < str.length()) {
                char nextChar = str.charAt(i + 2);
                for (int j = 0; j < count; j++) {
                    compressed.append(character);
                }
                if (Character.isAlphabetic(nextChar)) {
                    compressed.append(nextChar);
                }
            } else {
                for (int j = 0; j < count; j++) {
                    compressed.append(character);
                }
            }
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "ab2c1ac3";
        String furtherCompressed = furtherCompress(input);
        System.out.println(furtherCompressed);
    }

}
