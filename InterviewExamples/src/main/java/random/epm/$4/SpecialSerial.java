package random.epm.$4;

import java.io.Serializable;

class SpecialSerial implements Serializable {
    int x = 12;
    transient int y = 7;
    static int z = 9;

    public SpecialSerial() {
        x = 20;
    }

    public SpecialSerial(int x) {
        y = 10;
        x = x;
    }
}
