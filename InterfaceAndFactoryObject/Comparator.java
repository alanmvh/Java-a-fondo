package InterfaceAndFactoryObject;

public interface Comparator<T> extends java.util.Comparator<T> {
    public int compare(T a, T b);

    @Override
    boolean equals(Object obj);

    @Override
    default java.util.Comparator<T> reversed() {
        return java.util.Comparator.super.reversed();
    }

}
