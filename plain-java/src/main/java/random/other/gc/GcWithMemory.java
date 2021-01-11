package random.other.gc;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// https://www.youtube.com/watch?v=-ayMplONmkI
public class GcWithMemory {

    public static void main(String[] args) {
        method();
    }

    private static void method() {
        printMemory("=== Before GC ===");

        List<Date> dates = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            Date date = new Date();
            dates.add(date);
//            date = null;
        }
//        dates = null;

        printMemory("=== After loop ===");
        System.gc();
        printMemory("=== After GC ===");
    }

    public static void printMemory(String message) {
        System.out.println(message);
        System.out.println("Total memory " + humanReadableByteCountBin(Runtime.getRuntime().totalMemory()));
        System.out.println("Free memory " + humanReadableByteCountBin(Runtime.getRuntime().freeMemory()));
        System.out.println();
    }

    public static String humanReadableByteCountBin(long bytes) {
        long absB = bytes == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(bytes);
        if (absB < 1024) {
            return bytes + " B";
        }
        long value = absB;
        CharacterIterator ci = new StringCharacterIterator("KMGTPE");
        // System.out.println(Long.toBinaryString(1152865209611504844L));
        // 1111 1111 1111 1100 1100 1100 1100 1100 1100 1100 1100 1100 1100 1100 1100
        long l = 0xfffccccccccccccL;
        for (int i = 40; i >= 0 && absB > l >> i; i -= 10) {
            value >>= 10;
            ci.next();
        }
        value *= Long.signum(bytes);
        return String.format("%.1f %ciB", value / 1024.0, ci.current());
    }
}
