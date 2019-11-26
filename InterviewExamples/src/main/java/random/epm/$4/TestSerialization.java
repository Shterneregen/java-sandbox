package random.epm.$4;

import java.io.*;

public class TestSerialization {
    public static void main(String[] args) {
        SpecialSerial s = new SpecialSerial();
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("myFile"));
            os.writeObject(s);
            os.close();
            System.out.println(++s.z + " "); // 10
            System.out.println(s.z + " "); // 10

            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream("myFile"));
            SpecialSerial s2 = (SpecialSerial) is.readObject();
            is.close();
            System.out.println(s2.x + s2.y + " " + s2.z); // 20 10
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exc");
        }
    }
}
