import java.util.*;

public class HillCipher {
    private static int mod26(int n) {
        return ((n % 26) + 26) % 26;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] key = { { 3, 3 }, { 2, 5 } };
        System.out.print("Enter 2-letter text: ");
        String msg = sc.next().toUpperCase();
        int[] pt = { msg.charAt(0) - 'A', msg.charAt(1) - 'A' };
        int[] ct = new int[2];
        for (int i = 0; i < 2; i++)
            ct[i] = mod26(key[i][0] * pt[0] + key[i][1] * pt[1]);
        System.out.println("Encrypted Text: " + (char) (ct[0] + 'A') + (char) (ct[1] + 'A'));
        sc.close();
    }
}