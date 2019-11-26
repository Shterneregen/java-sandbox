package random.epm.$9;

public class Holder
//        implements Comparable
{
    private int h;

    public Holder(int h) {
        this.h = h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public boolean equals(Object obj) {
        return this.h == ((Holder) obj).h;
    }

    public int hashCode() {
        return h;
    }

//    @Override
//    public int compareTo(Object o) {
//        Holder holder = (Holder) o;
//        if (this.h > holder.h)
//            return 1;
//        else if (this.h < holder.h)
//            return -1;
//        return Integer.compare(this.h, holder.h);
//    }
}
