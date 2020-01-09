package random.oca_mock_1;

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class _29 {
    public static void change(Message m) {
        m = new Message();
        m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
    }
}
