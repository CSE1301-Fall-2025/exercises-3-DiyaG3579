package module10_allTheSecretCodes;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Q14OriginalCode {
    private static String[][] secretMessage;
    
    public static void createSecretMessage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How long is your message?");
        int n = scan.nextInt();
        String[] elements = new String[n];
        for (int r = 1; r <= n; r++){
            System.out.println("What element is in the " + r + " spot of your message");
            elements[r-1] = scan.next();
        }
        secretMessage = new String[n][n];
        int i = 0; 
        int j = 0;
        secretMessage = messageFiller(secretMessage, i, j, elements);
        saveMessageToFile(secretMessage);
    }
     public static String[][] getSecretMessage() {
        return secretMessage;
    }
    public static String[][] messageFiller(String[][] array, int i, int j, String[] elements){
        for (int g = 0; g < array[0].length; g++){
            array = messageFillerR(array, i, j, elements);
            i = i+1;
            j = 0;
        }
        return array;
    }
    public static String[][] messageFillerR(String [][] array, int i, int j, String[] elements){
        Scanner scan = new Scanner(System.in);
        if (j >= array[0].length){
            return array;
        }
        if (j == 0){
            System.out.println("What " + elements[i] + " would you like done?");
            String action = scan.next();
            array[i][j] = action;
        }
        else if (j > 0){
            System.out.println("What decoy " + elements[i] + " do you want?");
            String faction = scan.next();
            array[i][j] = faction;
        }
        return messageFillerR(array, i, j+1, elements);
    }
    public static void saveMessageToFile(String [][] message){
        try (FileWriter writer = new FileWriter("secretMessageOG.txt")) { // overwrites each time
            for (String[] row : message) {
                for (String cell : row) {
                    writer.write(cell + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving the message: " + e.getMessage());
        }
    }
    public static void main(String [] args){
        createSecretMessage();
    }
}
