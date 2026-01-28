package module09._03maps;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecretCode {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Map<String, String> SecretCode = new HashMap<>();

        System.out.println("How many messages would you like saved?");
        int m = scan.nextInt();
        scan.nextLine();
        
        for (int i = 1; i <= m; i++){
            System.out.println("What key would you like for the " + i + " message");
            String key = scan.nextLine();

            System.out.println("What message would you like encoded for the " + i + " slot");
            String message = scan.nextLine();

            SecretCode.put(key, message);
        }

        saveToFile(SecretCode);

        scan.close();    
    }
    private static void saveToFile(Map<String, String> secrets) {
        try (FileWriter writer = new FileWriter("secrets.txt")) {
            for (Map.Entry<String, String> entry : secrets.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving messages: " + e.getMessage());
        }
    }
}
