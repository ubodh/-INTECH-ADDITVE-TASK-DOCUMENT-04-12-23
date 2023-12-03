import java.util.Scanner;

public class compress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compress_String(str));

    }

    private static String compress_String(String str) {
        // str=aaabbbccdff=a3b3c2df2
        StringBuffer sb = new StringBuffer();
        char ch = str.charAt(0);
        int count = 1;
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                continue;
            } else {
                if (count > 1)
                    sb.append(count);
                count = 1;
                ch = str.charAt(i);
                sb.append(ch);
            }
            if (count > 1)
                sb.append(count);
        }
        return sb.toString().trim();
    }
}