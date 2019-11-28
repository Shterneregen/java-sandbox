package random.other.gb._1;

public class Engine {

    private String objName;

    public Engine(String objName) {
        this.objName = objName;
    }

    @Override
    // Overriding finalize method to check which object is garbage collected */
    protected void finalize() throws Throwable {
        // will print name of object
        System.out.println(this.objName + " successfully garbage collected");
    }
}

