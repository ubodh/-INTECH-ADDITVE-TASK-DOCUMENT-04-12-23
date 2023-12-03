import java.util.Scanner;

public class compresOne {

    public static String comppresBonusOne(String str) {

        // a2b2c1a3c3=aabbcaaaccc
        StringBuffer sb = new StringBuffer();
        char ch = '\0';
        int count = 0;

        //travers the array 
        for (char c : str.toCharArray()) {
            //check alphabet
            if (Character.isAlphabetic(c)) {
                if (count > 0) {
                    for (int i = 0; i < count; i++) {
                        sb.append(ch);

                    }
                }
                ch = c;
                sb.append(ch);
                count = 0;
                //check number
            } else if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            }
        }
// string literal convert 
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(comppresBonusOne(str));
    }
}
