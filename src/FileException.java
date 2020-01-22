import java.io.*;
import java.util.Scanner;

public class FileException {
    public static void main(String[] args) {
        openFile();
    }

    public static void parseString() {
        int num = Integer.parseInt("A");
        System.out.println(num);
    }

    public static void openFile() {
        File file = new File("notThere.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                System.out.println(reader.nextLine());
            }
            reader.nextLine();
        }
        catch (FileNotFoundException e) {
            System.out.println("Couldn't find file");
        }
        catch (IOException e) {
            System.out.println("An error occurred");
        }
        catch (Exception e) {
            System.out.println("Whoa! Didn't expect that");
        }
    }
}
