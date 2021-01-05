package random.other.gb;

// Object created inside a method :
// When a method is called it goes inside the stack frame. When the method is popped
// from the stack, all its members dies and if some objects were created inside it then these objects becomes
// unreachable or anonymous after method execution and thus becomes eligible for garbage collection

/* Java program to demonstrate that objects created inside a method will becomes
eligible for gc after method execution terminate */
class InsideMethodEligible {
    private String objName;

    public InsideMethodEligible(String objName) {
        this.objName = objName;
    }

    private static void show() {
        //object t1 inside method becomes unreachable when show() removed
        InsideMethodEligible t1 = new InsideMethodEligible("t1");
        display();
    }

    private static void display() {
        //object t2 inside method becomes unreachable when display() removed
        InsideMethodEligible t2 = new InsideMethodEligible("t2");
    }

    public static void main(String[] args) {
        // calling show()
        show();
        // calling garbage collector
        System.gc();
    }

    // Overriding finalize method to check which object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.objName + " successfully garbage collected");
    }
}
