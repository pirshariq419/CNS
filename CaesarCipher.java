import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter shift key: ");
        int key = sc.nextInt();

        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encrypted.append((char) (base + (c - base + key) % 26));
            } else {
                encrypted.append(c);
            }
        }
        System.out.println("Encrypted: " + encrypted);

        StringBuilder decrypted = new StringBuilder();
        for (char c : encrypted.toString().toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                decrypted.append((char) (base + (c - base - key + 26) % 26));
            } else {
                decrypted.append(c);
            }
        }
        System.out.println("Decrypted: " + decrypted);

        sc.close();
    }
}
