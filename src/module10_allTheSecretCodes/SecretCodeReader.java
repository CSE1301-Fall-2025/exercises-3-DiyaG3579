package module10_allTheSecretCodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecretCodeReader {
    public static void main(String[] args) {
        Map<String, String> secrets = loadFromFile();

        if (secrets == null) {
            System.out.println("No Secrets To Be Found Here - Are You Sure You Have the Right Mission");
            return;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your key:");
        String key = scan.nextLine();

        String message = secrets.get(key);

        if (message != null) {
            System.out.println(message);
        } else {
            System.out.println("No message found for that key.");
        }

        scan.close();
    }

    // Load file into a HashMap
    private static Map<String, String> loadFromFile() {
        try {
            Scanner scan = new Scanner(new File("secrets.txt"));
            Map<String, String> map = new HashMap<>();

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.contains("=")) {
                    String[] parts = line.split("=", 2); // split into key + message
                    map.put(parts[0], parts[1]);
                }
            }

            scan.close();
            return map;

        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
