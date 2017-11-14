import java.io.Serializable;

public class Interval<T extends Comparable & Serializable> {
    private T lower;
    private T upper;

    public Interval(T first, T second) {
        if (first.compareTo(second) <= 0) {
            lower = first;
            upper = second;
        }
        else {
            lower = second;
            upper = first;
        }
    }
}

//Type Erasure replaces T with a raw type.
//The raw type for Interval looks like this.
//public class Interval implements Serializable
//{
//    private Comparable lower;
//    private Comparable upper;
// . . .
//    public Interval(Comparable first, Comparable second) { . . . }
//}

