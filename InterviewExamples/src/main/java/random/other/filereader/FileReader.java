package random.other.filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReader {

    private static final Logger LOG = Logger.getLogger(FileReader.class.getName());

    public static void main(String[] args) {
        readFile("gradlew");
    }

    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName))) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            LOG.log(Level.SEVERE, e.getMessage(), e);
        }
    }
}
