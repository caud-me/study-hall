// note: `continue` to skip an iteration, `break` to terminate the whole loop
public class task15b_caudilla_arron {
    public static void main(String[] args) {
        String text = "programming";

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') continue;
            System.out.println(letter);
        }
    }
}
