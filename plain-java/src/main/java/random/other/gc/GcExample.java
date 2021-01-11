package random.other.gc;

public class GcExample {

    public static void main(String[] args) {
        // 1
//        Engine e1 = new Engine("e1");
//        Engine e2 = e1;

        // 2
        Engine e1 = new Engine("e1");
        Engine e2 = new Engine("e2");
        e1 = e2;
        e2 = e1;

        // 3
//        e1 = null;

        System.out.println(e1);
        System.out.println(e2);
        System.gc();
    }
}

class Engine {

    private String objName;

    public Engine() {
        objName = "default";
    }

    public Engine(String objName) {
        this.objName = objName;
    }

    @Override
    // Overriding finalize method to check which object is garbage collected
    protected void finalize() throws Throwable {
        System.out.println(this.objName + " successfully garbage collected");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "objName='" + objName + '\'' +
                '}';
    }
}

//    Which statement is true about this code?
//        It creates an object and the object is eligible for garbage collection.
//        It creates an object and the object is not eligible for garbage collection.
//        It creates two objects: e and e1. The e object is eligible for garbage collection.
//        It creates two objects and both the objects are ineligible for garbage collection.