public class Pair<T, V> {

    private T first;
    private V second;

    private Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getGetFirst() {
        return first;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static <T, V> Pair of(T first, V second) {
        return new Pair<T, V>(first, second);
    }

    @Override
    public boolean equals(Object object) {
        boolean rezult = false;
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(getClass())) {
            Pair<T, V> obj = (Pair<T, V>) object;
            if ((obj.first == null && first == null) && (obj.second == null && second == null)) {
                rezult = true;
            } else {
                rezult = (first != null && first.equals(obj.first))
                        && (second != null && second.equals(obj.second));
            }
        }

        return rezult;
    }

    @Override
    public int hashCode() {

        int firstHashCode = 0;
        int secondhHashCode = 0;
        if (first != null) {
            firstHashCode = first.hashCode();
        }
        if (second != null) {
            secondhHashCode = second.hashCode();
        }

        int startCode = 5;
        int rezultFirstHashCode = 31 * startCode + firstHashCode;
        int code = 31 * rezultFirstHashCode + secondhHashCode;

        return code;
    }

}

