package medium;


//Given a string, , print its SHA-256 hash value.
//HelloWorld


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Task16_Secure_Hash_Algorithm_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] message = md.digest(string.getBytes());
            BigInteger n = new BigInteger(1, message);
            StringBuilder hashText = new StringBuilder(n.toString(16));
            while (hashText.length() < 64) {
                hashText.insert(0, "0");
            }
            System.out.println(hashText);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }

    }


}

