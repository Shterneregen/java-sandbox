package random.other.gb;

// Reassigning the reference variable:
// When reference id of one object is referenced to reference id of some other object then the previous object
// has no any longer reference to it and becomes unreachable and thus becomes eligible for garbage collection.

/* Java program to demonstrate gc
 when one object referred to other object */
class NotEligible {
    // to store object name
    private String objName;

    public NotEligible(String obj_name) {
        this.objName = obj_name;
    }

    // Driver method
    public static void main(String[] args) {
        NotEligible t1 = new NotEligible("t1");
        NotEligible t2 = new NotEligible("t2");

        //t1 now referred to t2
        t1 = t2;

        // calling garbage collector
        System.gc();
    }

    @Override
    // Overriding finalize method to check which object is garbage collected */
    protected void finalize() throws Throwable {
        // will print name of object
        System.out.println(this.objName + " successfully garbage collected");
    }
}