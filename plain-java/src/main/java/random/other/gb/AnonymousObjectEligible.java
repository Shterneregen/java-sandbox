package random.other.gb;

// Anonymous object:
// The reference id of an anonymous object is not stored anywhere. Hence, it becomes unreachable.

// Java program to demonstrate gc of anonymous objects
class AnonymousObjectEligible {
    // to store object name
    String obj_name;

    public AnonymousObjectEligible(String obj_name) {
        this.obj_name = obj_name;
    }

    public static void main(String args[]) {
        //anonymous object without reference id
        new AnonymousObjectEligible("t1");

        // calling garbage collector
        System.gc();
    }

    @Override
    // Overriding finalize method to check which object is garbage collected
    protected void finalize() throws Throwable {
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}

