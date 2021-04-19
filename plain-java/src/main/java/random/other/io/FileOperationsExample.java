package random.other.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * When would you need to use the BufferedReader class over the Scanner class?
 * When you need to access a file inside a multithreaded application
 */
public class FileOperationsExample {

    private static final Logger LOG = Logger.getLogger(FileOperationsExample.class.getName());

    public static void main(String[] args) {
        List<String> fileLines = readFile(".gitignore");
        fileLines.forEach(System.out::println);

        System.out.println();

        List<String> allFileNamesInCurrentFolder = getAllFileNamesInCurrentFolder();
        allFileNamesInCurrentFolder.forEach(System.out::println);

        System.out.println();

        String newDir = "NEW_DIR";
        boolean newDirCreated = new File(newDir).mkdir();
        System.out.println("New dir created: " + newDirCreated);

        Path source = Paths.get(".gitignore");
        String copyPath = newDir + File.separator + "copy.gitignore";
        Path dest = Paths.get(copyPath);
        try {
            Path copy = Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Parent: " + dest.getParent());
            System.out.println("Root: " + dest.getRoot());
            System.out.println("FileName: " + dest.getFileName());

            boolean copyDeleted = Files.deleteIfExists(copy);
            System.out.println("Copy deleted: " + copyDeleted);
            boolean dirDeleted = new File(newDir).delete();
            System.out.println("New dir deleted: " + dirDeleted);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<String> fileLines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                fileLines.add(line);
            }
            return fileLines;
        } catch (IOException e) {
            LOG.log(Level.SEVERE, e.getMessage(), e);
        }
        return Collections.emptyList();
    }

    private static List<String> getAllFileNamesInCurrentFolder() {
        FilenameFilter fileFilter = getFilenameFilter(".");
        return Arrays.asList(Objects.requireNonNull(new File(".").list(fileFilter)));
    }

    private static FilenameFilter getFilenameFilter(String strToFind) {
        return (file, fileName) -> fileName.contains(strToFind);
    }
}
