public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        this.first = newValue;
    }

    public void setSecond(T newValue) {
        this.second = newValue;
    }
}


//Type Erasure does this if the class doesn't have any Type bounds restrictions.
// The raw type for Pair<T> looks like this.
//public class Pair
//{
//    private Object first;
//    private Object second;
//    public Pair(Object first, Object second)
//    {
//        this.first = first;
//        this.second = second;
//    }
//    public Object getFirst() { return first; }
//    public Object getSecond() { return second; }
//    public void setFirst(Object newValue) { first = newValue; }
//    public void setSecond(Object newValue) { second = newValue; }
//}

