package random.other.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Commander {

    private static final String CHAR_SET_NAME_WINDOWS = "windows-1251";
    private static final String CHAR_SET_UTF = "utf8";
    private static final String CHAR_SET_CP = "cp866";

    private static final String COMMAND = "cmd.exe /c dir";

    public static void main(String[] args) {
        runCommand(COMMAND, CHAR_SET_NAME_WINDOWS);
    }

    private static void runCommand(String command, String charsetName) {

        try {
            Process process = Runtime.getRuntime().exec(command);

            // Get input streams
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream(), charsetName));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream(), charsetName));

            // Read command standard output
            String s;
            System.out.println("Standard output: ");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // Read command errors
            System.out.println("Standard error: ");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}

