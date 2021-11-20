import java.util.*;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    int high, low;

    public Randoms(int min, int max) {
        this.low = min;
        this.high = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}
