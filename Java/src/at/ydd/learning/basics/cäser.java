package at.ydd.learning.basics;

public class cäser {
    public static void main(String[] args) {
        String rawtext = "Geheime Nachricht!";
        int key = 3;

        String secrettext = code(rawtext, key);
        System.out.println("Rohtext: " + rawtext + " ---> " + secrettext);

        String decoded = decode(secrettext, key);
        System.out.println("Geheimtext: " + secrettext + " ---> " + decoded);
    }


    public static String code(String rawtext, int key) {
        String secrettext = "";
        rawtext = rawtext.toLowerCase();
        for (int i = 0; i < rawtext.length(); i++) {
            char next = rawtext.charAt(i);
            secrettext = secrettext + shift(next, key);
        }
        return secrettext;
    }

    public static char shift(char letter, int shift) {
        if (letter >= 'a' && letter <= 'z') {
            letter += shift;
            while (letter > 'z') {
                letter -= 26;
            }
        }
        return letter;
    }

    public static String decode(String secrettext, int key) {
        String decoded = "";
        secrettext = secrettext.toLowerCase();
        for (int i = 0; i < secrettext.length(); i++) {
            char next = secrettext.charAt(i);
            decoded = decoded + shift(next, 26 - key);
        }
        return decoded;
    }
}
