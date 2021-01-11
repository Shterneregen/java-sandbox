package random.other.gc;

import java.util.ArrayList;
import java.util.List;

//-Xmx32m
//-XX:+UnlockCommercialFeatures
//-XX:+FlightRecorder
//-XX:StartFlightRecording=duration=60s
public class GarbageProducer {
    private static List<Object> list;

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(30_000);
        list = new ArrayList<>();
        for (int i = 0; i < 100_000_000; i++) {
            list.add(new Object());
        }
    }
}
