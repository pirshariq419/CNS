import java.util.*;

public class SubstitutionCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "QWERTYUIOPASDFGHJKLZXCVBNM";

        System.out.print("Enter plaintext: ");
        String text = sc.nextLine().toUpperCase();

        StringBuilder cipher = new StringBuilder();
        for (char c : text.toCharArray()) {
            int idx = alphabet.indexOf(c);
            cipher.append(idx != -1 ? key.charAt(idx) : c);
        }
        System.out.println("Ciphertext: " + cipher);

        StringBuilder plain = new StringBuilder();
        for (char c : cipher.toString().toCharArray()) {
            int idx = key.indexOf(c);
            plain.append(idx != -1 ? alphabet.charAt(idx) : c);
        }
        System.out.println("Decrypted text: " + plain);

        sc.close();
    }
}
