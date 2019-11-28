package random.other.gb;

// Nullifying the reference variable :
// When all the reference variables of an object are changed to NULL,
// it becomes unreachable and thus becomes eligible for garbage collection.

/* Java program to demonstrate gc
 when object reference changed to NULL */
class NullifyingReferenceEligible {
    // to store object name
    String obj_name;

    public NullifyingReferenceEligible(String obj_name) {
        this.obj_name = obj_name;
    }

    // Driver method
    public static void main(String args[]) {
        NullifyingReferenceEligible t1 = new NullifyingReferenceEligible("t1");

        /* t1 being used for some purpose in program */

        /* When there is no more use of t1, make the object
           referred by t1 eligible for garbage collection */
        t1 = null;

        // calling garbage collector
        System.gc();
    }

    @Override
    /* Overriding finalize method to check which object
     is garbage collected */
    protected void finalize() throws Throwable {
        // will print name of object
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}
