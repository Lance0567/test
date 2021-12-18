package Java8Features.Base64;

import java.util.Base64;

public class Base64BasicEncryptionExample2 {
    public static void main(String[] args) {
        // Getting encoder
        Base64.Encoder encoder = Base64.getUrlEncoder();
        // Encoding URL
        String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
        System.out.println("Encoder URL: " + eStr);
        // Getting decoder
        Base64.Decoder decoder = Base64.getUrlDecoder();
        // Decoding URL
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded URL" + dStr);
    }
}