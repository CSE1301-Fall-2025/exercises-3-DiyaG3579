package module10_allTheSecretCodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q15OriginalCodeReader {
    public static String[][] loadMessageFromFile() {
        try {
            Scanner scan = new Scanner(new File("secretMessageOG.txt"));

            // Count lines (rows)
            int rows = 0;
            while (scan.hasNextLine()) {
                rows++;
                scan.nextLine();
            }
            scan.close();

            // Reopen to read contents
            Scanner scan2 = new Scanner(new File("secretMessageOG.txt"));
            String[][] message = new String[rows][rows]; // square array
            int i = 0;
            while (scan2.hasNextLine()) {
                String[] parts = scan2.nextLine().trim().split("\\s+");
                for (int j = 0; j < parts.length; j++) {
                    message[i][j] = parts[j];
                }
                i++;
            }
            scan2.close();
            return message;

        } catch (FileNotFoundException e) {
            System.out.println("Message file not found! Please run Q14 first.");
            return null;
        }
    }
    
    public static String[] messageReader(String[][] array, String[] message, int i, int j, int code){
        if (j >= array[0].length){
            return message;
        }
        if (code == i+1){
            message[j] = array[j][i];
            messageReader(array, message, i, j+1, code);
        }
        else{
            messageReader(array, message, i+1, j, code);
        }
        return message;
    }

     public static void main(String [] args){
        String[][] secretMessage = loadMessageFromFile();
        if (secretMessage == null) return;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your secret code?");
        int code = scan.nextInt();
        int i = 0; int j = 0;
        String[] message = new String [secretMessage[0].length];
        message = messageReader(secretMessage, message, i, j, code);
        for (int e = 0; e < message.length; e++){
          System.out.println(message[e]);
        }
    }
}
